fun main(){
    for (i in 0..20)
        println("F: $i | C: ${celsius(i)}")
}
fun celsius(fTemp: Int): Double {
    return ((fTemp - 32)*(5.00/9.00))
}