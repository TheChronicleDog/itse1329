package week04
//Walter, 04.1, 9/20/22
import java.util.*
fun main(){
    val integerVal = infoAsk("Please input a positive non-zero integer >>")
    var sum = 0
    var i = 1
    while (i < integerVal+1) {
        sum += i
        println(sum)
        i++
    }
    println("Your final sum is $sum")
}

fun infoAsk(askType: String): Int {
    val scanner = Scanner(System.`in`)
    print(askType)
    return scanner.nextInt()
}

