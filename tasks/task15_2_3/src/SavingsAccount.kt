// Task 15.2.3: SavingsAccount class
class SavingsAccount(val rate: Double, holder: String) : BankAccount(holder) {
    init {
        require(rate > 0)
    }

    fun applyInterest() {
        deposit((balance * rate).toInt())
    }
}