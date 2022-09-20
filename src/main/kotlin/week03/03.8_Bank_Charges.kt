import java.util.*

fun main() {
//Hill, 3.8, 9/20/22

    val scanner = Scanner(System.`in`)
    print("How many checks have you written in a month? >>")
    val checks = scanner.nextDouble()

    println("Your bank service fees are: $${calculateCost(checks)}")
}

fun calculateCost(c: Double): Double {
    val costFor20Less = .10
    val costFor20to39 = .08
    val costFor40to59 = .06
    val costFor60orMore = .04

    var cost= 10.0
    if (c in 0.0..19.0) {
        cost = c * costFor20Less + 10
    } else if (c in 20.0..39.0) {
        cost = c * costFor20to39 + 10
    } else if (c in 40.0..59.0) {
        cost = c * costFor40to59 + 10
    } else if (c >= 60) {
        cost = c * costFor60orMore + 10
    }

    return cost

}