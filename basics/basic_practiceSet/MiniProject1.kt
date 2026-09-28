val names = mutableListOf<String>()
val ages = mutableListOf<Int>()
val marks = mutableListOf<Int>()

fun main() {
    while (true) {
        println("Please select 1-5 for choices")
        println("1. Add  2. Find  3. Remove  4. Show  5. Exit")
        val input = readln()

        if (input == "5") break

        val inp = input.toIntOrNull() ?: 0

        when (inp) {
            1 -> add()
            2 -> find()
            3 -> remove()
            4 -> show()
            else -> println("Invalid Choice")
        }
    }
}

fun add() {
    println("Enter the name here:")
    val name = readlnOrNull() ?: ""
    names.add(name)

    println("Enter the age:")
    val age = readlnOrNull()?.toIntOrNull() ?: 0
    ages.add(age)

    println("Enter the marks:")
    val mark = readlnOrNull()?.toIntOrNull() ?: 0
    marks.add(mark)

    println("Added successfully")
}

fun find() {
    println("Enter the name here:")
    val name = readlnOrNull()

    var isFound = false

    for (i in names.indices) {
        if (names[i] == name) {
            println("${names[i]} | ${ages[i]} | ${marks[i]}")
            isFound = true
            break
        }
    }

    if (!isFound) {
        println("No entry found for $name")
    }
}

fun remove() {
    println("Enter the name here:")
    val name = readlnOrNull()

    var isRemoved = false

    for (i in names.indices) {
        if (names[i] == name) {
            println("${names[i]} | ${ages[i]} | ${marks[i]} is removed")

            names.removeAt(i)
            ages.removeAt(i)
            marks.removeAt(i)

            isRemoved = true
            break
        }
    }

    if (isRemoved) {
        println("Updated List")
        show()
    } else {
        println("No entry found for $name")
    }
}

fun show() {
    for (i in names.indices) {
        println("${names[i]} | ${ages[i]} | ${marks[i]}")
    }
}