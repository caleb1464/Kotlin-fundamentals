fun main() {
    val marksList = mutableListOf<Int>()
    var input: String?
    do {
        print("Enter a mark (or type 'done' to finish): ")
        input = readLine()
        if (input != null && input != "done") {
            try {
                val mark = input.toInt()
                if (mark in 0..100) {
                    marksList.add(mark)
                } else {
                    println("Invalid mark. Marks should be between 0 and 100.")
                }
            } catch (e: NumberFormatException) {
                println("Invalid input. Please enter a valid number.")
            }
        }
    } while (input != null && input != "done")

    marksList.forEach { mark ->
        val grade = when (mark) {
            in 86..100 -> "A"
            in 46..85 -> "B"
            in 26..45 -> "C"
            in 0..25 -> "D"
            else -> "Invalid"
        }
        println("Mark $mark is graded as $grade")
    }
}
