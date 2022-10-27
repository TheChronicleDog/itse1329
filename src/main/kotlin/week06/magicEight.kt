import kotlin.random.Random
fun main() {
    val responses = arrayOf(
        "Yes, of course!",
        "Without a doubt, yes.",
        "You can count on it.",
        "For sure!",
        "Ask me later.",
        "I’m not sure.",
        "I can’t tell you right now. I’ll tell you after my nap. No way!",
        "I don’t think so.",
        "Without a doubt, no.",
        "The answer is clearly NO."
    )
    while (true){
        print("What is your question my child (Type quit to exit)? >>")
        val question = readln()
        if (question.lowercase().equals("quit"))
            break
        val respNum = Random.nextInt(1,10)
        println(responses[respNum])
    }

}