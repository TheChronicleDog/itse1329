fun main() {

    print("Please enter first name >> ")
    val name1: String = readln()

    print("Please enter second name >> ")
    val name2: String = readln()

    print("Please enter last name >> ")
    val name3: String = readln()

    val nameList = listOf(name1, name2, name3).toSortedSet()

    println(nameList.elementAt(0))
    println(nameList.elementAt(1))
    println(nameList.elementAt(2))

}
