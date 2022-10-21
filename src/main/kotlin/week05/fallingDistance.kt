fun main(){
    for (i in 1..10){
        println(fallingDistance(i))
    }

}
fun fallingDistance(fallTime :Int ):Double{
    val distance = .5*(9.8*fallTime*fallTime)
    return distance
}