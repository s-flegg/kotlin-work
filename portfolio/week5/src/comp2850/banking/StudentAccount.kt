package comp2850.banking

class StudentAccount(holder: String, _overdraft: Int=0): BankAccount(holder) {
    var overdraft = _overdraft
        set (value) {
            require(value>=0 && value<=100)
            field = value
        }

    override fun withdraw(amount: Int) {
        require(amount>0) {"Withdrawal amount must be greater than 0"}
        require(balance-amount >= -1*overdraft) {"Insufficient funds for withdrawal"}

        balance -= amount
    }
    fun withdrawalsAllowed(): Boolean {return balance > -1*overdraft}
    override fun toString(): String {return "Account for $holder, balance = $balance (overdraft = $overdraft)"}
}