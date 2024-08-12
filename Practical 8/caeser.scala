import scala.io.StdIn.readLine

object CaesarCipher extends App{

    def encrypt(text:String,shift:Int):String={
        text.map{char=>
            if(char.isUpper){
                ('A'+(char-'A'+shift)%26).toChar
            }
            else if(char.isLower){
                ('a'+(char-'a'+shift)%26).toChar

            }
            else{
                char
            }
        }
    }

    def decrypt(text:String,shift:Int):String={
        encrypt(text,26-shift)
    }

    def cipher(text:String,shift:Int,operation:(String,Int)=>String):String={
        operation(text,shift)
    }

    println("Enter a text: ")
    val txt=readLine()

    println("Enter number of shifts: ")
    val sh=readLine().toInt

    println("Enter 1 for encrypt 2 for decrypt: ")
    val op=readLine().toInt

    val newtxt=if(op==1){
        cipher(txt,sh,encrypt)
    }
    else if(op==2){
        cipher(txt,sh,decrypt)
    }
    else{
        "Invalid input!"
    }

    

    println(s"Resulted text: $newtxt")


}