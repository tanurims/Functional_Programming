import scala.io.StdIn.readLine

object even extends App{

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

    def filterEvenNumbers(numbers:List[Int]):List[Int]={
        numbers.filter(num=>num%2==0)
    }


    val even=filterEvenNumbers(numbers)

    println("Input: " + numbers)
    println("Output: " + even)

}