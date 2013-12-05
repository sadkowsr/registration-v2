git log --pretty=format:"%ae :: %an" | sort | uniq 
echo "---" 
echo "total number of registred people: "
git log --pretty=format:"%ae :: %an" | sort | uniq  | wc -l
