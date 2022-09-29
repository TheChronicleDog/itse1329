fun main() {
    print("What is the mass? (Kilos) >> ")
    val mass = readln().toInt()

    val weight = mass * 9.8

    if (weight > 1000)
        println("The object is ${weight} newtons, this is too heavy")
    else if (weight < 10)
        println("The object is ${weight} newtons, this is too light")
    else
        println("The object is ${weight} newtons, this is manageable")

}