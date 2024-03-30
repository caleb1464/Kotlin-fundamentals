fun main() {
    var greeting = "Hello world"
    var firstname = "Caleb"
    var lastname = "Mwangi"

    //String concatenation
    println("$firstname $lastname")
    println(firstname.plus(lastname))

    //Accessing an element in a string
    println(greeting[6])

    //Determining the index position of an element
    println(greeting.indexOf("world"))
    println(greeting.indexOf('o'))

    // Modifying a string
    println(greeting.uppercase())
    println(greeting.lowercase())

    //String interpolation
    println("Hello There, my name is $firstname $lastname")

    //Size of a string
    println(greeting.length)
}