#include <algorithm>
#include <functional>
#include <future>
#include <iostream>
#include <mutex>
#include <utility>
#include <vector>

template <class T>
class monitor
{
private:
    mutable T obj;
    mutable std::mutex access;

    T synced_obj_copy() const
    {
        std::lock_guard<std::mutex> lock{access};
        return obj;
    }

public:
    monitor() = default;

    monitor(const T& _obj)
        : obj(_obj)
    {}

    monitor(T&& _obj)
        : obj{std::move(_obj)}
    {}

    monitor(const monitor<T>& other_monitor)
        : obj{other_monitor.synced_obj_copy()}
    {}

    monitor& operator=(const monitor& other_monitor)
    {
        {
            std::lock_guard<std::mutex> lock{access};
            obj = other_monitor.synced_obj_copy();
        }
        return *this;
    }


    template <typename F>
    auto operator()(F f) const -> decltype(f(obj))
    {
        std::lock_guard<std::mutex> lock{access};
        return f(obj);
    }
};

monitor<std::reference_wrapper<std::ostream>> synced_cout{{std::cout}};


int main()
{
    const auto name = {'e', 't', 'a', 'm'};
    auto futures = std::vector<std::future<void>>{};
    for (char c : name)
        futures.emplace_back(std::async(std::launch::async, [c]{
            synced_cout([c](std::ostream& ostream) {
                ostream << c;
            });
        }));
    for (std::future<void>& future : futures)
        future.wait();
    return 0; 
}
