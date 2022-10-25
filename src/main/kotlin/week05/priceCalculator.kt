fun calculateRetail(wsCost : Float, markupPercent : Int):Float{
    val percent :Float = (markupPercent / 100).toFloat()
    return wsCost + (wsCost*percent)
}
fun main(){
    print("Please enter the markup percent as a whole number >> ")
    val markup = Integer.parseInt(readLine())
    print("Please enter the cost of the object >> ")
    val cost = readLine()?.toFloat()
    print("If an item’s wholesale cost is $$cost and its markup percentage is $markup percent, then the item’s retail price is $${cost?.let {
        calculateRetail(
            it,markup)
    }}.")
}