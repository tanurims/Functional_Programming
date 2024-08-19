import scala.io.StdIn.readLine

object Interest extends App{

val calInterest:Double=>Double=deposit=>{
    if(deposit<=20000) deposit*0.02
    else if(deposit<=200000) deposit*0.04
    else if(deposit<=2000000) deposit*0.035
    else deposit*0.065
}

println("Enter deposit amount: ")
val deposit=readLine().toInt
val interest=calInterest(deposit)
println(s"Interest of deposit amount Rs.$deposit : Rs.$interest")

}