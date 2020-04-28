import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of A = ")
    val a = scanner.nextInt()

    print("Enter the value of B = ")
    val b = scanner.nextInt()

    println("Please select the option ")
    println("Press 1 for Addition")
    println("Press 2 for Subtraction")
    println("Press 3 for Multiplication")
    println("Press 4 for Division")

    print("Enter the button : ")
    val option = scanner.nextInt()

    val cal = Calculator()
    var res:Int ?= null

    if (option == 1){
        res = cal.add(a,b)
    }
    else if (option == 2){
        res = cal.subtract(a,b)
    }
    else if (option == 3){
        res = cal.multiplication(a,b)
    }
    else if (option == 4){
        res = cal.division(a,b)
    }
    else{
        println("Selected Unknown Option")
    }

    println("The result is : $res")

}