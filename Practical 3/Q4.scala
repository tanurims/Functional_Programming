import scala.io.StdIn.readLine

object Q4 extends App{

    def getinput():List[Int]={
        var numbers=List[Int]()
        var continue=true

        while(continue){
            println(s"Enter a number or type 0 to finish: ")
            val input=readLine().toInt
            if(input==0){
                continue=false
            }
            else{
                numbers=numbers :+ input
            }
        }

        numbers
    }

    def sumofeven(input:List[Int]):Int={
        var sum=0
        if(input.isEmpty){
            0
        }
        else{
           
           for(num<-input){
            if(num%2==0){
                sum=sum+num
            }
           }
        }
        sum
    }

    val numbers=getinput()
    val result=sumofeven(numbers)

    println(s"Sum of even numbers in ${numbers} is: ${result} ")
}

    