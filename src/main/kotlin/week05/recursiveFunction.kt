
fun fibonacci(number: Int):Int{
    return if(number <= 1)
        number
    else
        fibonacci(number -1) + fibonacci( number - 2)
}
fun main() {
    for (i in 0..10){
        println(fibonacci(i))
    }

}
