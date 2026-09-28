fun main(){
    var largestSoFar:Int=Int.MIN_VALUE
    val list:MutableList<Int> = mutableListOf()
    println("enter Here how many integers you want to input")
    val n = readlnOrNull()?.toIntOrNull() ?: 0
    println("enter Here The integers now")
    repeat(n){
        val temp = readlnOrNull()?.toIntOrNull() ?: 0
        list.add(temp)
    }
    for(i in list){
        if(i>largestSoFar){
            largestSoFar=i
        }
    }
    println("The Largest Int is:"+ largestSoFar.toString())
}   