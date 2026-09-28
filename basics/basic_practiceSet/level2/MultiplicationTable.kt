fun main(){
    while(true){
        println("enter Here the value of n(TYPE N to exit)")
        val input=readln()
        if(input.equals("N",ignoreCase=true)) break
        val n=input.toIntOrNull() ?: continue
        for(i in 1..10){
            println("${n} X ${i} = ${n*i}")
        }
    }
} 