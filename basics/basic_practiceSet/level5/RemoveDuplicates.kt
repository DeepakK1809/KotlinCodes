fun removeDuplicates(list: MutableList<Int>): MutableList<Int> {
    val result = mutableListOf<Int>()

    for (i in list) {
        var found = false

        for (j in result) {
            if (i == j) {
                found = true
                break
            }
        }

        if (!found) {
            result.add(i)
        }
    }

    return result
}

fun main() {
    while (true) {
        println("Enter the size or N to exit")

        val input = readln()
        if (input.equals("N", ignoreCase = true)) break

        val size = input.toIntOrNull() ?: continue
        val list = mutableListOf<Int>()

        for (i in 1..size) {
            println("Enter the $i value:")
            val temp = readln().toIntOrNull() ?: 0
            list.add(temp)
        }

        println("Original list: $list")

        val uniqueList = removeDuplicates(list)

        println("List after removing duplicates: $uniqueList")
    }
}