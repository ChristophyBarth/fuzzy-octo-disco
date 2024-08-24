package classes

fun main() {
    val customer = Customer("Christophy",)
    customer.updateAge(56)
    customer.updateNIN("3269334928373")


    val customer2 = Customer("William", 74, Account(balance = 1000.0))
    customer2.welcome()
    customer2.withdrawMoney(howMuch = 550.0)
}