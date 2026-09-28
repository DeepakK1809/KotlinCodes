fun fact(n:Int):Int{
    if(n==0 || n==1){
        return 1
    }
    if(n<0){
        return -1
    }
    return n*fact(n-1)
    
}
fun main(){
    while(true){
        println("enter here the Input or N to exit")
        val input=readln()
        if(input.equals("N",ignoreCase=true)) break
        val n=input.toIntOrNull() ?:  continue
        println(" the factorial of ${n} is ${fact(n)}")
        
    }
}