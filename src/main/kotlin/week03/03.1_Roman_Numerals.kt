fun main() {
    var numberString:String

    println("Please enter a number between 1 and 10: ")
    val number:Int = readln().toInt()

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