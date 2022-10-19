package week04
//Walter, 04.2, 9/20/22
fun main(){
    val word = inforAsk("Please enter a string >> ")
    val letter = inforAsk("Please enter a character to search for >> ").first()
    val wordArray = word.toCharArray()
    var numOfLetter = 0

    for (x in wordArray) if (x == letter.uppercaseChar() || x== letter.lowercaseChar()) numOfLetter++
    print("There are $numOfLetter $letter's in $word")
}
fun inforAsk(askType: String) : String {
    print(askType)
    return readln()
}