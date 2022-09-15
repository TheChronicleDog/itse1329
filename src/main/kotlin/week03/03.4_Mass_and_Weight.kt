import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("What is the mass? (Kilos) >> ")
    val mass = scanner.nextInt()

    val weight = mass * 9.8

    if (weight > 1000)
        println("The object is ${weight} newtons, this is too heavy")
    else if (weight < 10)
        println("The object is ${weight} newtons, this is too light")
    else
        println("The object is ${weight} newtons, this is manageable")

}