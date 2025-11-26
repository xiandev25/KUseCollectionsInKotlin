fun main() {
//    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
//    val gasPlanets = arrayOf("Jupiter", "Satan", "Uranus", "Neptune")
//
//    val solarSystem = rockPlanets + gasPlanets
//
//    println(solarSystem[0])
//    println(solarSystem[1])
//    println(solarSystem[2])
//    println(solarSystem[3])
//    println(solarSystem[4])
//    println(solarSystem[5])
//    println(solarSystem[6])
//    println(solarSystem[7])
//
//    solarSystem[3] = "Little Earth"
//    println(solarSystem[3])
//
//    solarSystem[8] = "Pluto"

//    val solarSystem = listOf<String>("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//    println(solarSystem.size)
//    println(solarSystem[2])
//    println(solarSystem.get(2))
//
//    println(solarSystem.indexOf("Earth"))
//    println(solarSystem.indexOf("Pluto"))
//
//    for (planet in solarSystem) {
//        println(planet)
//    }

//    val solarSystem = mutableListOf<String>("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//    solarSystem.add("Pluto")
//    solarSystem.add(3, "Theia")
//    solarSystem[3] = "Future Moon"
//
//    printList(solarSystem)
//
//    println()
//    println(solarSystem[3])
//    println(solarSystem[9])
//
//    println(solarSystem.removeAt(3))
//    println(solarSystem.remove("Future Moon"))
//    println(solarSystem.remove("lakdjfadf"))
//
//    printList(solarSystem)
//
//    println("Future Moon" in solarSystem)
//    println(solarSystem.contains("Pluto"))

    val solarSystem = mutableSetOf<String>("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
}

//fun printList(aList: List<String>) {
//    for (planet in aList) {
//        print(planet)
//        if (aList.indexOf(planet) != (aList.size - 1)) {
//            print(" - ")
//        } else {
//            println()
//        }
//    }
//}