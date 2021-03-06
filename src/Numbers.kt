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

    println("How much would you like to tip, we recommend 17.5%? (Put answer in decimal form Eg. 17.5% as .175)")
    tip = readLine()!!.toDouble()

    val totalTax = cost + (cost*tax)
    val totalTax2 = twoDigits.format(totalTax)
    val totalCost = cost + (cost*tax) + (cost*tip)
    val total = twoDigits.format(totalCost)
    println("total of all your items: $cost")
    println("total of all your items with tax: $totalTax2")
    println("Your total with tax and tip is: $total")
}