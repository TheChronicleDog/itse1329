import java.util.*
//[REDACTED], 03.7, 9/15/22
fun main() {
    val doesContainVegan = infoAsk("a Vegan")
    val doesContainVegetarian = infoAsk("a Vegetarian")
    val doesContainGlutenFree = infoAsk("gluten-free")

    val restaurants = mutableListOf(
        "Joe’s Gourmet Burgers", "Main Street Pizza Company", "Corner Café", "Mama’s Fine Italian",
        "The Chef’s Kitchen"
    )
    val narrowedRestaurants = narrowField(doesContainVegetarian,doesContainVegan,doesContainGlutenFree, restaurants)

    println("Here are you restaurant choices:")
    println("")
    for(item in narrowedRestaurants ) {
        println(item)
    }
}

fun infoAsk(askType: String): Boolean {
    val scanner = Scanner(System.`in`)
    println("Is anyone in your party $askType?")
    return scanner.nextLine().lowercase() == "yes"
}

fun narrowField(vegan: Boolean, vegetarian: Boolean, nonGluten: Boolean, restaurants: MutableList<String>): MutableList<String> {
    if (vegetarian) {
        restaurants.remove("Joe’s Gourmet Burgers")
    }
    if (vegan) {
        restaurants.remove("Joe’s Gourmet Burgers")
        restaurants.remove("Main Street Pizza Company")
        restaurants.remove("Mama’s Fine Italian")
    }
    if(nonGluten){
        restaurants.remove("Joe’s Gourmet Burgers")
        restaurants.remove("Mama’s Fine Italian")
    }
    return restaurants
}