import java.util.Scanner

//The Doctor, 04.5, 9/20/22
fun main() {
    val input = Scanner(System.`in`)
    val random = (0..100).random()
    print("Please guess a value between 0 and 100 including both >> ")
    val inputVal = input.nextInt()
    var newVal = inputVal

    while (newVal != random) {
        if (newVal > random) {
            println("Too high, try again")
        }
        else {
            println("Too low, try again")
        }
        print("Please guess a value between 0 and 100 including both >> ")
        newVal = input.nextInt()
    }
    print("Nice you got it! The value is $random!")

}