fun main() {
    var languages = arrayOf("Kotlin","Javascript","Python","C++")
    println(languages[1])

    //Reassigning a value
    languages[1] = "PHP"
    println(languages[1])

    //Looping through an array
    for (lang in languages)
    {println(lang)}

    //Determining whether an element exists or not
    if ("PHP" in languages)
    {println("It exists")}
    else{println("It does not exist")}
}