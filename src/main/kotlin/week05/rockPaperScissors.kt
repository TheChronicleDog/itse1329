import kotlin.random.Random

fun main() {
    while (true) {
        val compChoice = Random.nextInt(1, 3)
        val playerChoiceNum = playerAsk()
        val choices = arrayOf("N/A", "Rock", "Paper", "Scissors")
        println("You chose ${choices[playerChoiceNum]}")
        println("Computer chose ${choices[compChoice]}")
        if (playerChoiceNum == compChoice) {
            println("Tie, please try again")
        }
        when(playerChoiceNum){
            1 -> if (compChoice == 3) {print("You Win!");break} else if(compChoice == 2) {print("You Lose!");break}
            2 -> if (compChoice == 1) {print("You Win!");break} else if(compChoice == 3){print("You Lose!");break}
            3 -> if (compChoice == 2) {print("You Win!");break} else if(compChoice == 1){print("You Lose!");break}
        }
    }
}

fun playerAsk():Int {
    print("Choose Rock, Paper, Or Scissors >> ")
    val playerChoice = readLine()
    var choice = 0
    if (playerChoice != null) {
        when (playerChoice.lowercase()) {
            "rock" -> choice = 1
            "paper" -> choice =  2
            "scissors" -> choice = 3
        }

    }
    return choice
}

