class Account(val accountNum:String,var balance:Double){

    def deposite(amount:Double):Unit={
        if(amount>0){
            balance=balance+amount
            println(s"Deposited ${amount} into account ${accountNum}.New balance ${balance}")
        }
        else{
            println("Deposite amount must be positive!!")
        }
    }

    def withdraw(amount:Double):Unit={
        if(amount>0 && amount<=balance){
            balance=balance-amount
            println(s"Withdraw ${amount} from account ${accountNum}.New balance ${balance}")

        }
        else if(amount>balance){
            println(s"Insufficient funds")
        }
        else{
            println("Withdrawal amount must be positive!!")

        }
    }

    def transfer(amount:Double,toAccount:Account):Unit={
        if(amount>0 && amount<=balance){
            this.withdraw(amount)
            toAccount.deposite(amount)
            balance=balance-amount
            println(s"Transferred ${amount} from account ${accountNum} to account ${toAccount.accountNum}.New balance is ${balance}")

        }
        else if(amount>balance){
            println(s"Insufficient funds")
        }
        else{
            println("Transfer amount must be positive!!")

        }
    }

    def showBalance():Unit={
        println(s"Account ${accountNum} balance: ${balance}")

    }
}

object Banking extends App{

    val account1=new Account("B123",1000.0)
    val account2=new Account("B125",15000.0)
    val account3=new Account("B134",500.0)

    account1.deposite(1000)
    account2.withdraw(500)

    account2.transfer(1000,account3)

    account1.showBalance()
    account2.showBalance()
    account3.showBalance()



}