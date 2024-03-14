fun main() {
    println("Enter the first number:")
    val number1 = readLine()?.toDoubleOrNull()

    println("Enter the operator (+, -, *, /, %):")
    val operator = readLine()

    println("Enter the second number:")
    val number2 = readLine()?.toDoubleOrNull()

    if (number1 == null || number2 == null || operator == null) {
        println("Invalid input. Please enter valid numbers and operator.")
        return
    }

    val result = when (operator) {
        "+" -> number1 + number2
        "-" -> number1 - number2
        "*" -> number1 * number2
        "/" -> number1 / number2
        "%" -> number1 % number2
        else -> {
            println("Invalid operator.")
            return
        }
    }

    println("Result: $result")
}
