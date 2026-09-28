fun main() {
    while (true) {
        println("Enter age (N to exit):")
        val input = readln()

        if (input.equals("N", ignoreCase = true)) break

        val n = input.toIntOrNull() ?: continue

        when (n) {
            in 1..12 -> println("Child")
            in 13..17 -> println("Teen")
            in 18..59 -> println("Adult")
            in 60..199 -> println("Senior/Old")
            in 200..1000 -> println("Ghost")
            else -> println("ErrorFaced")
        }
    }
}