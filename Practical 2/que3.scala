object que3 extends App{

    def total(x:Int,y:Int)=(x*250)+(y*85)
    def tax(x:Int,y:Int)=total(x,y)*12/100
    def takehomesal(x:Int,y:Int)=total(x,y)-tax(x,y)

    val sal=takehomesal(40,30)
    println(s"Take home salary for 40 normal hours and 30 OT hours= Rs.$sal")
}