import scala.io.StdIn.readLine

object Q2 extends App{

    def getinput():List[String]={
        var inputlist=List[String]()
        var continue=true

        while(continue){
            println(s"Enter a string or type f to finish: ")
            val input=readLine()
            if(input=="f"){
                continue=false
            }
            else{
                inputlist=inputlist :+ input.trim
            }
        }

        inputlist
    }

    def filter(strings:List[String]):List[String]={

      var filterlist=List[String]()
      for(str<-strings){
        if(str.length()>5){
            filterlist=filterlist :+ str
        }
      }

      filterlist

    }

    val userInput=getinput()
    val filtered=filter(userInput)

    println(s"Original ${userInput} and Filtered ${filtered}")
}