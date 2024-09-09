import scala.io.StdIn.readLine

class Rational(n:Int,d:Int){

    
    val num:Int=n
    val den:Int=d

    def sub(n1:Int,d1:Int,n2:Int,d2:Int):Rational={
        val num=n1*d2-n2*d1
        val den=d1*d2

        new Rational(num,den)
    }

    override def toString:String=s"$num/$den"
}

object RationaSub extends App{
    val xn=3
    val xd=4
    val yn=5
    val yd=8
    val zn=2
    val zd=7

    val rational=new Rational(0,1)

    val internum=xn*yn
    val interden=xd*yd

    val result=rational.sub(internum,interden,zn,zd)

    println(s"x.y-z = $result")


}
