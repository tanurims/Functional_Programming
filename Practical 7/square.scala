import scala.io.StdIn.readLine

object sqaure extends App{

    var numbers=List[Int]()
    var flag=true
    while(flag){
        println("Enter a number or 0 to stop")
        val num=readLine().toInt

        if(num==0){
            flag=false
        }
        else{
            numbers=numbers:+num
        }
    }

    numbers

    def calculateSquare(numbers:List[Int]):List[Int]={
        numbers.map(num=>num*num)
    }


    val square=calculateSquare(numbers)

    println("Input: " + numbers)
    println("Output: " + square)

}