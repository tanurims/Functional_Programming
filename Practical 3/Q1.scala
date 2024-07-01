import scala.io.StdIn.readLine

object Q1 extends App{

    println(s"Enter a string to reverse=> ")
    var s=readLine()

    def reversestr(s:String):String={
        if(s.isEmpty()){
            " "
        }
        else{
            reversestr(s.tail) + s.head
        }

    }

    println(s"Reversed string of ${s} is ${reversestr(s)}")

}