fun main() {
    while (true) {
        println("Enter the Integer or N to exit")

        val input = readln()
        if (input.equals("N", ignoreCase = true)) break

        var int = input.toIntOrNull() ?: continue
        var newInt = 0
        var sign = 1

        if (int < 0) {
            sign = -1
            int *= -1
        }

        while (int != 0) {
            val temp = int % 10
            newInt = newInt * 10 + temp
            int /= 10
        }

        newInt *= sign

        println("The reversed int is $newInt")
    }
}