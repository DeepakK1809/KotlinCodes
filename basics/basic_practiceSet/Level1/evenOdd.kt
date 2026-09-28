fun main(){
    val int:Int?=readlnOrNull()?.toInt()
    val output=if(int!=null && int%2==1)"Odd" else"Even"
    println(output)
}