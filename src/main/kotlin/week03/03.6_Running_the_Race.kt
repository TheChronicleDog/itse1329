import java.util.*

fun main() {

    val name1 = setName("first")
    val name2 = setName("second")
    val name3 = setName("third")

    val time1 = setTime("first")
    val time2 = setTime("second")
    val time3 = setTime("third")

    val nameList = mutableListOf(name1, name2, name3)
    val timeList = listOf(time1, time2, time3).toSortedSet()

    val time1Index: Int = timeList.indexOf(time1)
    val time2Index: Int = timeList.indexOf(time2)
    val time3Index: Int = timeList.indexOf(time3)


    nameList[time1Index] = name1.capitalize()
    nameList[time2Index] = name2.capitalize()
    nameList[time3Index] = name3.capitalize()

    println("First place with ${timeList.elementAt(0)} minutes : ${nameList.elementAt(0)}")
    println("Second place with ${timeList.elementAt(1)} minutes : ${nameList.elementAt(1)}")
    println("Third place with ${timeList.elementAt(2)} minutes : ${nameList.elementAt(2)}")


}

fun setName(order: String): String {
    val scanner = Scanner(System.`in`)
    print("Please enter $order name >> ")
    return scanner.nextLine()
}

fun setTime(order: String): Int {
    val scanner = Scanner(System.`in`)
    print("Please enter $order time >> ")
    return scanner.nextInt()
}
