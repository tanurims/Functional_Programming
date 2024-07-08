object patternmatching:

  def main(args:Array[String]):Unit={

    if(args.length==0){
      println("Please input a valid integer")
    }
    else{

      val input=args(0).toInt

      println(s"${input} -> ${categorize(input)}")
 
    }
  }

  def categorize(n: Int):String = n match{
          case n if n<=0 =>"Negative/Zero Integer"
          case n if n%2==0 =>"Input is Even"
          case _ =>"Input is Odd"
      }


  


