fun main() {
    var isMagic:Boolean

    println("Please input the month as a number: ")
    val month:Int = readln().toInt()
    println("Please input the day as a number: ")
    val day:Int = readln().toInt()
    println("Please input the last two digits of the year: ")
    val year:Int = readln().toInt()

    isMagic = day*month == year

    if (isMagic){
        println("This is a magic date!")
    }
    else{
        println("This date is not magic!")
    }

}