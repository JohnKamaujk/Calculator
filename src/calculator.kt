import java.util.*

fun main(args: Array<String>) {
    val reader=Scanner(System.`in`)
    println("Enter two numbers:")

//    nextDouble()reads the next double from the keyboard
    val first = reader.nextDouble()
    val second =reader.nextDouble()

    print("Enter an operator (+,-,*,/): ")
    val operator =reader.next()[0]

    val result:Double

    when(operator){
        '+' -> result = first + second
        '-' -> result = first - second
        '*' -> result = first * second
        '/' -> result = first / second
//        operator does not match any case constant
        else ->{
            println("Error! operator is not correct")
            return
        }
    }
    println(result)
}