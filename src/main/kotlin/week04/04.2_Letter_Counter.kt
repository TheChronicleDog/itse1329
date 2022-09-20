package week04
//Walter, 04.1, 9/20/22
import java.util.*
fun main(){
    val word = inforAsk("Please enter a string >> ")
    val letter = inforAsk("Please enter a character to search for >> ").first()
    val wordArray = word.toCharArray()
    var numOfLetter = 0

    for (x in wordArray) if (x == letter.uppercaseChar() || x== letter.lowercaseChar()) numOfLetter++
    print("There are $numOfLetter $letter's in $word")
}
fun inforAsk(askType: String) : String {
    val scanner = Scanner(System.`in`)
    print(askType)
    return scanner.nextLine()
}