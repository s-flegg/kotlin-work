// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val account = SavingsAccount(0.018, "Me")
    account.deposit(1250)
    for (i in 1..5) {
        account.applyInterest()
    }
    account.withdraw(50)
    println(account.balance)
}
