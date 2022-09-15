import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    print("Please enter the name of your favorite city >> ")
    val cityName: String = scanner.nextLine()

    println(" Number of characters : ${cityName.length}")
    println(" Uppercase : ${cityName.uppercase()}")
    println(" Lowercase ${cityName.lowercase()}")
    println(" First Letter : ${cityName.take(1)}")






}