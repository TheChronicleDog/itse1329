import kotlin.math.pow

fun main() {
    val principalVal = askForInfo("principal deposited")
    val interestVal = askForInfo("interest rate")
    val compoundPerYear = askForInfo("# of times interest was compounded per year")
    val yearsLeft = askForInfo("# of years the account will be left")

    calculateAndPrint(principalVal,interestVal,compoundPerYear,yearsLeft)
}

fun askForInfo(questionType: String): Double {

    print("What was the $questionType? >> ")
    val value = readln().toDouble()
    return value
}

fun calculateAndPrint(pVal: Double, iVal: Double, cVal: Double, yVal: Double) {
    val part1 : Double = 1 + ((iVal/100)/cVal)
    val result : Double = pVal*(part1.pow(cVal*yVal))
    print("The amount of money in the account after $yVal years, is : $result")
}