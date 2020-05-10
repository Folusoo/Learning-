
fun sayHello (greeting:String, vararg itemsToGreet:String) {
            itemsToGreet.forEach { itemsToGreet ->
                println("$greeting $itemsToGreet")
            }

            }
fun greetPerson (greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main() {
    val person = Person()
    person.printInfo()
}


//If and Else Expression

/*   val age : Int = 16
    if (age < 10) {
        println("You are too young to watch this movie")
    } else if (age < 13) {
        println("You may watch this movie with your parents")
    } else {
        println("You can watch this movie")
}
*/
