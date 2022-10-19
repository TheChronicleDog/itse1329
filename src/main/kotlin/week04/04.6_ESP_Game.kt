package week04
//Jackson, 04.6, 9/22/22
import java.util.Scanner
import kotlin.random.Random

fun main() {
    val input = Scanner(System.`in`)
    val colorList = listOf("red", "green", "blue", "orange", "yellow")
    print("You got it correct ${guess(input,colorList)} times!")
}
fun guess(input :Scanner,colorList: List<String>):Int{
    println("Guess a color (Red, Green, Blue, Orange, or Yellow) - 10 times")
    var randomColor:String
    var guess: String
    var correctNum = 0

    for (i in 1..10) {
        randomColor = colorList.get(Random.nextInt(0, colorList.size))
        print("$i: ")
        guess = input.nextLine()
        while (!colorList.contains(guess.lowercase())) {
            println("Not a valid input, Try again")
            print("$i: ")
            guess = input.nextLine()
        }
        println("Color was: ${randomColor.capitalize()}")
        if (guess.lowercase() == randomColor.lowercase()) {
            correctNum++
        }
    }
    println()
    return correctNum
}