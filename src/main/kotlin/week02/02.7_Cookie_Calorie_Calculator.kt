fun main() {

    //val reader = Scanner(System.`in`)
    println("Enter number of cookies eaten: ")
    val cookiesEaten = readln()
    val CAL_PER_COOKIE = 300 / (40/10) // or 75
    val caloriesGained = cookiesEaten.toInt() * CAL_PER_COOKIE
    println("Your calorie intake was: ${caloriesGained} calories")
}