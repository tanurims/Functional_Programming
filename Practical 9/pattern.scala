object pattern:
    val patternMatching:Int=>String=num=>num match{
        case x if num<=0 => "Negative/Zero is input"
        case x if num%2==0 => "Even number is given"
        case _ =>"Odd number is given"
    }

   
    def main(args:Array[String]):Unit={

        if(args.length==0){
        println("Please input a valid integer")
        }
        else{

        val num=args(0).toInt

        println(s"$num ->${patternMatching(num)}")
    
        }

        
    }

