import java.util.*
//Mcfly, 4.3, 9/20/22
fun main() {
    var startPop = inputInfo("What is the starting number of organisms? >> ")
    startPop = misInputCheck(startPop,2.0,"What is the starting number of organisms? >> ")
    var popInc = inputInfo("Daily population increase? >> ")
    popInc = misInputCheck(popInc,0.0,"Daily population increase? >> ")
    var days = inputInfo("For how many days? >> ")
    days = misInputCheck(days,1.0,"For how many days? >> ")
    var newPop =startPop

    println("Day 0, Population:${newPop.toInt()}")
    for (i in 1..days.toInt()) {
        newPop += popInc * newPop
        println("Day $i, Population:${newPop.toInt()}")
    }

}

fun inputInfo(question: String): Double {
    val response = Scanner(System.`in`)
    print(question)
    return response.nextDouble()
}
fun misInputCheck(value: Double, bottomRange: Double, restateQuestion:String):Double{
    val response = Scanner(System.`in`)
    var newValue= value
    while((newValue < bottomRange)) {//error message
        println("ERROR Please enter a valid value")
        println("")
        println(restateQuestion)
        newValue =  response.nextDouble()
    }
    return newValue

}