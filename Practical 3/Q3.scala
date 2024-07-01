import scala.io.StdIn.readLine

object Q3 extends App{

    println(s"Enter number 1: ")
    val n1=readLine().toInt
    println(s"Enter number 2: ")
    val n2=readLine().toInt

    def arithmean(x:Int,y:Int):Double={

    val mean=(x+y).toFloat/2
    
    mean
   }

    println(f"The arithmetic mean of ${n1} and ${n2} is ${arithmean(n1,n2)}%.2f")
}