fun main(){
    
    val List=listOf(1,2,3,4,5)
    for(i in List){
        println(i)
    }
    val new_list=mutablelistOf<String>("A","B","C","E")
    for(i in new_list){
        println(i)
    }
    new_list.add("F")
}