//Parent class or Super class or Base class
open class Animal{
    var age = 2
    var gender = "female"

    fun move(movement:String){
        println("Animal is $movement")
    }
}

//Child class or Sub class or Derived class
open class Duck:Animal(){
    var color = "white"
    fun sound(){
        println("The Duck is quacking")
    }
}
class  Fish:Duck(){
    var hasScales = true
    var hasFins = true

    fun eat(){
        println("The Fish is eating")
    }
}

fun main() {
    var a = Animal()

    var d = Duck()
    println(d.gender)
    d.move("swim")
    var nileperch = Fish()
}