package week04

import java.util.Scanner
fun main(){
    val store1Sales = getValue(1)
    val store2Sales = getValue(2)
    val store3Sales = getValue(3)
    val store4Sales = getValue(4)
    val store5Sales = getValue(5)

    println("SALES BAR CHART")
    printBar(1,store1Sales)
    printBar(2,store2Sales)
    printBar(3,store3Sales)
    printBar(4,store4Sales)
    printBar(5,store5Sales)

}
fun getValue(storeNum : Int):Int{
    val input = Scanner(System.`in`)
    print("Enter today's sales for store $storeNum:")
    return input.nextInt()
}
fun printBar(storeNum: Int,storeSales:Int){
    print("Store $storeNum:")
    for (i in 1..(storeSales/100)) print("*")
    println()
}