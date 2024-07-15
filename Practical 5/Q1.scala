import scala.io.StdIn.readLine

object inventory extends App {

    def getProductList():List[String]={
        var items=List[String]()
        var continue=true

        while(continue){
            println("Enter a product name or type 'done' to finish: ")
            val input=readLine()
            if(input.toLowerCase=="done"){
                continue=false
            }
            else{
                items=items:+input
            }
        }

        items
    }

    def printProductList(items:List[String]):Unit={
        var x=1
        for(str<-items){
            println(s"${x}. ${str}");
            x=x+1
        }
    }

    def getTotalProducts(items:List[String]):Unit={
        val tot=items.length
        println(s"Total number of products: ${tot}")
    }

    val productList=getProductList()
    println("Product List: ")
    printProductList(productList)
    getTotalProducts(productList)

}
