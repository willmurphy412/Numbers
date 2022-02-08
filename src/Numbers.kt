import java.text.DecimalFormat

fun main() {
   var userInput: Int
   var cost: Int
   val tax = .025
   val tip: Double
   val twoDigits = DecimalFormat("$###,###,###.00")

    println("Please enter the cost of your first item below:")
    userInput = readLine()!!.toInt()
    cost = userInput
    do{
        println("Please enter the cost of your next item. If you would like to stop enter 0")
        userInput = readLine()!!.toInt()

        cost += userInput
    }while(userInput != 0)

    println("How much would you like to tip? (Put answer in decimal form Eg. 2.5% as .025)")
    tip = readLine()!!.toDouble()

    val totalCost = cost + (cost*tax) + (cost*tip)
    val total = twoDigits.format(totalCost)
    println("Your total with tax and tip is: $total")
}