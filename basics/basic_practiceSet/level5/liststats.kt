fun main() {
    while (true) {
        println("Enter the size or N to exit")
        val input = readln()
        if (input.equals("N", ignoreCase = true)) break

        val size = input.toIntOrNull() ?: 0
        val list = mutableListOf<Int>()

        for (i in 1..size) {
            println("Enter the ${i} value:")
            val inp = readln()
            val temp = inp.toIntOrNull() ?: 0
            list.add(temp)
        }

        LstFuns(list, size)
    }
}

fun LstFuns(list: MutableList<Int>, size: Int) {
    for (i in list) {
        print("$i ")
    }

    println()
    println("The Sum of all elements is ${list.sum()}")
    println("The Max of all elements is ${list.max()}")
    println("The Min of all elements is ${list.min()}")
    println("The Avg of all elements is ${list.sum().toDouble() / size}")
}