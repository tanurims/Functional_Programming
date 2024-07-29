import scala.io.StdIn.readLine

object student extends App{


    def getStudentInfo: (String, Int, Int, Double, Char)={
        println("Enter student's name: ")
        val name = readLine()

        println("Enter student's marks: ")
        val marks = readLine().toInt

        println("Enter total possible marks: ")
        val totmarks = readLine().toInt

        val percentage=(marks.toDouble/totmarks)*100
        val grade= percentage match{
            case p if p>=90 => 'A'
            case p if p>=75 => 'B'
            case p if p>=50 => 'C'
            case _          => 'D'
        }

        (name, marks, totmarks, percentage, grade)
    }

    
    def printRecord(record: (String,Int,Int,Double,Char)): Unit={
        val(name, marks, totmarks, percentage, grade)=record
        println(s"Student Name: $name")
        println(s"Marks: $marks / $totmarks")
        println(f"Percentage: $percentage%.2f")
        println(s"Grade: $grade")
    }

    def validInput(name: String, marks: Int, totmarks: Int): (Boolean,String)={
        if(name.isEmpty){
            (false,"Name cannot be empty.Try again")
        }
        else if(marks<0 ||marks>totmarks){
            (false, "Marks must be a positive integer and less than or equal to total possible marks.Try again")

        }
        else if(totmarks<=0){
            (false, "Total possible marks must be a positive integer.Try again")

        }
        else{
            (true,"")
        }
    }

    def getStudentInfoWithRetry():(String,Int,Int,Double,Char) = {
        var isvalid=false
        var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'D')

        while(!isvalid){
            println("Enter student's name: ")
            val name = readLine()

            println("Enter student's marks: ")
            val marks = readLine().toInt

            println("Enter total possible marks: ")
            val totmarks = readLine().toInt

            val (valid, errorMsg) = validInput(name, marks, totmarks)

            if(valid){
                val percentage=(marks.toDouble/totmarks)*100
                 val grade= percentage match{
                    case p if p>=90 => 'A'
                    case p if p>=75 => 'B'
                    case p if p>=50 => 'C'
                    case _          => 'D'
                }
                studentInfo = (name, marks, totmarks, percentage, grade)
                isvalid = true
            }
            else{
                 println(s"Error: $errorMsg")
            }


        }
        studentInfo

    }


    //calling functions
    val studentInfo = getStudentInfoWithRetry()
    printRecord(studentInfo)
}