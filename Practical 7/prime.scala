import scala.io.StdIn.readLine

object prime extends App{

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

    def primeChecker(n:Int):Boolean={
        if(n<=1){
            false
        }
        else if(n==2||n==3){
            true
        }
        else{
            var i=1
            var count=0

            while(i<=n){
                if(n%i==0){
                    count=count+1
                }

                i=i+1
            }

            if(count>2){
                false
            }
            else{
                true
            }
        }
    }


    def filterPrime(numbers:List[Int]):List[Int]={
        numbers.filter(primeChecker)
    }


    val prime=filterPrime(numbers)

    println("Input: " + numbers)
    println("Output: " + prime)

}

