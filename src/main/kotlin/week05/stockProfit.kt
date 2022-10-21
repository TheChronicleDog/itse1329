fun main(){
    print("Please enter the Number Of Shares >> ")
    val NS = readln().toDouble()
    print("Please enter the Purchase Price Per Share >> ")
    val PP = readln().toDouble()
    print("Please enter the Purchase Commission Paid >> ")
    val PC = readln().toDouble()
    print("Please enter the Sale Price Per Share >> ")
    val SP = readln().toDouble()
    print("Please enter the Sale Commission Paid >> ")
    val SC = readln().toDouble()
    print("The overall profit is : ${stocks(NS,PP, PC, SP, SC)}")
}
fun stocks(NS : Double, PP : Double, PC : Double, SP : Double, SC : Double):Double{
    return ((NS*SP)-SC) - ((NS*PP)+PC)
}