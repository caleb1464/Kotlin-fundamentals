fun main() {
    //While loop
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++
    }
    var num = 100
    while (num >= 95){
        println("Number is $num")
        num--
    }

    //Do...while loop
    var x = 20
    do {
        println(x)
        x++
    } while (x <= 25)

    //for loop
    var furniture = arrayOf("Table","Chair","Desk")
    for (z in furniture){
        println(z)
    }
    var marks = arrayOf(8,5,7)
    for (mark in marks){
        println("Marks is $mark")
    }

    //Range
    for (number in 30..35){
        println(number)
    }
    for (letter in 'a'..'d'){
        println("Letter is $letter")
    }

}
