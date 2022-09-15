import java.util.Scanner
fun main() {
    val reader = Scanner(System.`in`)
    var day:Int = 2
    var month:Int= 11
    var year:Int= 22
    var isMagic:Boolean

    println("Please input the month as a number: ")
    month = reader.nextInt()
    println("Please input the day as a number: ")
    day = reader.nextInt()
    println("Please input the last two digits of the year: ")
    year = reader.nextInt()

    isMagic = day*month == year

    if (isMagic){
        println("This is a magic date!")
    }
    else{
        println("This date is not magic!")
    }

}