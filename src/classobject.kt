class Person{
    //Attributes or Properties
    var name = "John"
    var age = 67
    var gender = "Male"

    //Methods or functions
    fun walk() {
        println("Person is walking")
    }
}

fun main() {
    var accountant = Person()
    accountant.walk()
    println(accountant.gender)
}