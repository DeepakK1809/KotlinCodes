fun main(){
    println("program to Sum first N digits")
    while(true){
        println("enter Here the value of n(Enter N to Exit )")
        val input=readln()
        if(input.equals(("N"), ignoreCase = true)) break
        val N:Int=input.toIntOrNull() ?: continue
        var sum=(N*(N+1))/2
        println("The Sum of The Integers from ${1..N} is ${sum}")
        sum=0
        println("using the for loop")
        for(i in 1..N){
            sum+=i;
        }
        println("The Sum of The Integers from ${1..N} is ${sum}")
        
        
        
    }
}