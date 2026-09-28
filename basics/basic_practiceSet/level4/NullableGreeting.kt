fun greet(string:String?){
    val name=string ?: "Stranger"
    println("Hello ${name}")
}

fun main(){
    while (true) {
        println("Enter Name or N to exit")
        val input = readln()
        if (input.equals("N", ignoreCase = true)) break
        greet(input)
    }
}