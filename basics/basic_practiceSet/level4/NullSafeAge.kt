fun readAge(): Int? {

    println("entere the n here")
    val input = readlnOrNull()
    return input?.toIntOrNull()
    return n
}

fun main() {
    val age = readAge()
    print(age)
}