import java.util.*
//Hill, 03.8, 9/17/2022
fun main(){
    val checks = recieveInfo("checks")
    calculateChecksAndPrint(checks)


}
fun recieveInfo(questionType: String): Double {
    val scanner = Scanner(System.`in`)
    print("How many $questionType have you written this month? >> ")
    val value = scanner.nextDouble()
    scanner.nextLine()
    return value
}
fun calculateChecksAndPrint(checkNum : Double){
    var totalVal = 10.0
    when {
        checkNum < 20 -> totalVal = 10 + (checkNum* .10)
        checkNum in 20.0..39.0 -> totalVal = 10 + (checkNum* .08)
        checkNum in 40.0..59.0 -> totalVal = 10 + (checkNum* .06)
        checkNum >= 60 -> totalVal = 10 + (checkNum* .04)
    }
    print("Bank Service fee for $checkNum checks in month: $totalVal")

}