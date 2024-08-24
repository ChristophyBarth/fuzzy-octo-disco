package classes

import classes.Account

/*class Customer(val name: String, val age: Int) {

}*/

class Customer{
    private var name: String? = null
    private var age: Int? = null
    var nin: String? = null
    var account: Account? = null

    constructor(name: String, age: Int, account: Account){
        this.name = name
        this.age = age
        this.account = account
    }

    constructor(name: String){
        this.name = name
    }

    fun withdrawMoney(howMuch: Double){
        if (nin == null){
            println("You can't withdraw without NN")
        }else {
            account?.withdraw(howMuch)
            println("Hi ${name}. Your new balance is ${account?.balance}")
        }
    }

    fun welcome(){
        greet()
        showBalance()
    }

    private fun greet(){
        println("Hello ${this.name}")
    }

    private fun showBalance(){
        println(account?.balance)
    }

    fun updateNIN(nin: String){
        this.nin = nin
    }

    fun updateAge(age: Int){
        this.age = age
    }


}
