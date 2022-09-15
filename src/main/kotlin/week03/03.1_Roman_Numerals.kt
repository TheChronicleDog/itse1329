import java.util.Scanner
fun main() {
    var number:Int
    var numberString:String
    val reader = Scanner(System.`in`)
    println("Please enter a number between 1 and 10: ")
    number = reader.nextInt()

    when (number){
        1 -> numberString = "I"
        2 -> numberString = "II"
        3 -> numberString = "III"
        4 -> numberString = "IV"
        5 -> numberString = "V"
        6 -> numberString = "VI"
        7 -> numberString = "VII"
        8 -> numberString = "VIII"
        9 -> numberString = "IX"
        10 -> numberString = "X"
        else -> numberString = "Number Not Within Range"
    }

    println("${number} In Roman Numerals is ${numberString}")

}