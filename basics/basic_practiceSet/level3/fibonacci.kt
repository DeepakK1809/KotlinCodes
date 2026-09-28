fun GetFibonaci(n: Int): MutableList<Int> {
    val list = mutableListOf<Int>()

    if (n <= 0) return list
    if (n == 1) {
        list.add(0)
        return list
    }

    list.add(0)
    list.add(1)

    for (i in 2 until n) {
        list.add(list[i - 1] + list[i - 2])
    }

    return list
}
fun main(){
    while (true) {
        println("entere the n here or Enter N to Exit")
        val input = readln()
        if (input.equals("N", ignoreCase = true)) break

        val n = input.toIntOrNull() ?: continue
        println(GetFibonaci(n))
    }

}