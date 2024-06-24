object que2 extends App{

    var a=2
    var b=3
    var c=4
    var d=5
    var k=4.3f

    b=b-1
    val A=b*a+c*d
    println(s"a.--b*a+c*d-- = $A")
    d=d-1

    println(s"b.a++ =$a")
    a=a+1

    val g=10
    val C= -2*(g-k)+c
    println(s"c.(-2*(g-k)+c) =$C")

    println(s"d.c=c++ =$c")
    c=c+1

    c=c+1
    c=c*a
    println(s"e.c=++c*a++ =$c")
    a=a+1
}
