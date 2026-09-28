fun PrimeCheck(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    if (n == 2 || n == 3) {
        return true
    }
    if (n % 2 == 0 || n % 3 == 0) {
        return false
    }
    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false
        }
        i += 6
    }
    return true
}
fun main(){
     while (true) {
        println("entere the n here or Enter N to Exit")
        val input = readln()
        if (input.equals("N", ignoreCase = true)) break

        val n = input.toIntOrNull() ?: continue
        for(i in 1..n){
           if(PrimeCheck(i)){
              print("${i}, ")
           }
        }
        println("")
    }

}