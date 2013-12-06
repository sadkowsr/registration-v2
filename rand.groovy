// Run: groovy rand.groovy

def r(s, n) {
    Random random = new Random(s)
    def randString = new StringBuilder()
    (1..n).each {
        randString.append(random.nextInt(127) as char)
    }
    return randString
}

println "${r(0x4dbe3c136773ef27,3)} ${r(0x66b0a68ac6cfaf6b,4)} ${r(0x694b708d252ca7c9, 1)}"