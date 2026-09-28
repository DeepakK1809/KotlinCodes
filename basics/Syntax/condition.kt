fun main() {

    val age: Int? = readlnOrNull()?.toIntOrNull()

    val msg = if (age != null && age >= 18) "Adult" else "Minor"

    println(msg)
    when(age){
        1->"minor"
        2->"Minor"
        18->"adult"
        null->"no value entered"
        else->"Adult"
    }
    for(i in 1..5){
        print("Hello"+{i}.toString())
    }
}