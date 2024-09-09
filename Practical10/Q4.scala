class Account(val accountNum:String,var amount:Double){

    def showBalance():Unit={
        println(s"${accountNum} account balance is ${amount}")
    }

    def interest():Unit={
        if(amount>0){
            amount=amount+amount*0.05
        }
        else{
            amount=amount+amount*0.1
        }
    }
}

object BankAccounts extends App{

    val account1=Account("A345",1025)
    val account2=Account("A123",-2500)
    val account3=Account("A678",20000)
    val account4=Account("A102",-500)
    val account5=Account("A100",1500)
    val account6=Account("A900",-10)

    val acclist:List[Account]=List(account1,account2,account3,account4,account5,account6)

    val negativeAccount=acclist.filter(_.amount<0)
    println(s"Accounts with negative balances: ")
    for(account <- negativeAccount){
        account.showBalance()
    }

    val totBalance=acclist.map(_.amount).sum
    println(s"Total balance of all acounts: Rs. ${totBalance}")

    println("After applying interest and display final balances: ")
    for(account <- acclist){
        account.interest()
        account.showBalance()
    }





}
    