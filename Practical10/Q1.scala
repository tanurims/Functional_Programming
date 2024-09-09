import scala.io.StdIn.readLine

class Rational(n:Int,d:Int){

    
    val num:Int=n
    val den:Int=d

    def neg: Rational=new Rational(-num,den)

    override def toString:String=s"$num/$den"
}

object RationalNum extends App{
    println("Enter the numerator: ")
    val num=readLine().toInt

    println("Enter the denominator: ")
    val den=readLine().toInt

    if(den==0){
        println("Denominator cannot be 0")
    }
    else{
        val x=new Rational(num,den)

        println(s"Rational Number: $x")
        println(s"Negated Rational Number: ${x.neg}")
    }

}
