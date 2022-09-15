import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("What is your weight (pounds) >> ")
    val weight = scanner.nextInt()
    scanner.nextLine()
    print("What is your height (inches) >> ")
    val height = scanner.nextInt()
    scanner.nextLine()

    val BMI = (weight * 703) / (height * height)

    if (BMI < 18.5)
        println("Your BMI is ${BMI}, this is considered underweight")
    else if (BMI > 25)
        println("Your BMI is ${BMI}, this is considered overweight")
    else
        println("Your BMI is ${BMI}, you are considered average")

}
