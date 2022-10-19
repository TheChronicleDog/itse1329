fun isNumberDivisble(number: Int, divisor: Int): Boolean {
    return (number % divisor == 0)
}

fun isPrime(number: Int): Boolean {
    var numIsPrime= true
    if (number > 0) {
        for (i in 2..(number / 2))
            if (isNumberDivisble(number, i))
                numIsPrime = false
    }
    else
        numIsPrime = false
    return numIsPrime
}
fun main(){
    print(isPrime(3123423))
}