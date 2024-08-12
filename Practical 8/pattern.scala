object pattern:

    def main(args:Array[String]):Unit={

        if(args.length==0){
        println("Please input a valid integer")
        }
        else{

        val input=args(0).toInt

        println(s"${input} -> ${categorize(input)}")
    
        }
    }

    val categorize: Int=>String=number=>number match{
        case n if n%3==0 && n%5==0 => "Multiple of both Three and Five"
        case n if n%3==0 => "Multiple of Three"
        case n if n%5==0 => "Multiple of Five"
        case _ => "Not a Multiple of Three or Five"



    }