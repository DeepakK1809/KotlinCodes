fun greet() {
    val name: String? = readlnOrNull()
    println("Hello $name")
}

fun add(int1: Int, int2: Int): Int {
    return int1 + int2
}

fun main() {

    val i = readln().toInt()
    val j = readln().toInt()

    println(add(i, j))

    greet()
}