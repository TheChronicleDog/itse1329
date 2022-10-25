fun main() {
    var currentLocation = "northHall"
    while (true) {
        currentLocation = currentLocInfo(currentLocation)
    }
}

fun currentLocInfo(currentLocation: String): String {
    val locations = arrayOf("bedroom2", "southHall", "diningRoom", "bedroom1", "northHall", "kitchen", "balcony")
    var directions = arrayListOf<String>("north", "south", "east", "west")
    when (currentLocation) {
        locations[0] -> {
            directions = arrayListOf("north", "east")
            println("You find yourself in a dusty old bedroom, books lining the walls.")
            println("Passages lead north and east.")
            print("Which way do you go? ")
        }

        locations[1] -> {
            directions = arrayListOf("north", "east", "west")
            println("You are in a large ornate hallway, knight armor sets pressed up against the walls.")
            println("Passages lead north, east and west.")
            print("Which way do you go? ")
        }

        locations[2] -> {
            directions = arrayListOf("north", "west")
            println("You enter a dining room, with a large wooden table in the center, old rotting food sitting idly upon it.")
            println("Passages lead north and west.")
            print("Which way do you go? ")
        }

        locations[3] -> {
            directions = arrayListOf("south", "east")
            println("You find yourself in a large old master bedroom, a queen size bed in the center surrounded by a multitude of flowers.")
            println("Passages lead south and east.")
            print("Which way do you go? ")
        }

        locations[4] -> {
            directions = arrayListOf("north", "south", "east", "west")
            println("You walk into a large empty hall, dusty footprints filling the otherwise barren room.")
            println("Passages lead north, east, south and west.")
            print("Which way do you go? ")
        }

        locations[5] -> {
            directions = arrayListOf("south", "west")
            println("You enter a kitchen, pots and pans on stoves that had not been kindled in what seems like years.")
            println("Passages lead south and west.")
            print("Which way do you go? ")
        }

        locations[6] -> {
            directions = arrayListOf("south")
            println("You exit the building, finding yourself on a large balcony, cold wind whipping past your ears.")
            println("The only way is south, back where you came from.")
            print("Which way do you go? ")
        }
    }
    return changeLoc(currentLocation, directions, locations)
}

fun changeLoc(currentLocation: String, directions: ArrayList<String>, locations: Array<String>): String {
    var playerInput = readLine()?.lowercase()
    var newLocation = "N/A"
    while (!directions.contains(playerInput)) {
        println("Please provide valid input: ")
        playerInput = readLine()?.lowercase()
    }
    when (currentLocation) {
        locations[0] -> {
            when (playerInput) {
                "north" -> newLocation = locations[3]
                "east" -> newLocation = locations[1]
            }
        }

        locations[1] -> {
            when (playerInput) {
                "north" -> newLocation = locations[4]
                "east" -> newLocation = locations[2]
                "west" -> newLocation = locations[0]
            }
        }

        locations[2] -> {
            when (playerInput) {
                "north" -> newLocation = locations[5]
                "west" -> newLocation = locations[1]
            }
        }

        locations[3] -> {
            when (playerInput) {
                "south" -> newLocation = locations[0]
                "east" -> newLocation = locations[4]
            }
        }

        locations[4] -> {
            when (playerInput) {
                "north" -> newLocation = locations[6]
                "south" -> newLocation = locations[1]
                "east" -> newLocation = locations[5]
                "west" -> newLocation = locations[3]
            }
        }

        locations[5] -> {
            when (playerInput) {
                "south" -> newLocation = locations[2]
                "west" -> newLocation = locations[4]
            }
        }

        locations[6] -> {
            when (playerInput) {
                "south" -> newLocation = locations[4]
            }
        }
    }


    return newLocation
}