import scala.io.StdIn.readLine

object que4 extends App{

    def attendance(price:Int)=120+(15-price)/5*20
    def cost(price:Int)=500+3*attendance(price)
    def income(price:Int)=price*attendance(price)
    def profit(price:Int)=income(price)-cost(price)

    println(s"Enter the ticket price=> ")
    var p=readLine().toInt
    println(s"profit= Rs. ${profit(p)}")
}