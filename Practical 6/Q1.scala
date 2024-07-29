object inventory extends App{

    case class Product(id: Int,name: String, quantity: Int, price:Double)

    val inventory1:Map[Int, Product]= Map(
        1001-> Product(1001,"Laptop",10,350000),
        1002-> Product(1002,"Smartphone",18,85000),
        1003-> Product(1003,"Tablet",22,355000),
        1004-> Product(1004,"Keyboards",100,1000)
    )

    val inventory2:Map[Int, Product]= Map(
        1002-> Product(1002,"Smartphone",20,75000),
        1005-> Product(1005,"Headphones",26,6000),
        1006-> Product(1006,"Moniters",12,25000)
    )


    def retrieveNames(inventory: Map[Int,Product]) : List[String]={
        inventory.values.map(_.name).toList
    }

    def totalValue(inventory: Map[Int,Product]) : Double={
        var totVal=0.0
        for((i,product) <- inventory){
            totVal += product.quantity*product.price
        }

        totVal
    }

    def isempty(inventory: Map[Int,Product]) : Boolean={
        inventory.isEmpty
    }

    def mergeInventory(inven1: Map[Int,Product], inven2: Map[Int,Product]) : Map[Int, Product]={
        var mergeinven=inven1

        for((id,product) <- inven2){
            if (mergeinven.contains(id)){
                val existproduct=mergeinven(id)
                val updateproduct=Product(
                    id,
                    product.name,
                    existproduct.quantity + product.quantity,
                    if(existproduct.price < product.price){
                        product.price
                    }
                    else{
                        existproduct.price
                    }
                )

                mergeinven += (id->updateproduct)
            }
            else{
                mergeinven += (id->product)
            }
        }

            mergeinven
    }

    def format(inventory: Map[Int,Product]): String = {
        inventory.map{case(id, product)=> 
                s"ID: $id, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}"
            }.mkString("\n")
    }

    def checkProduct(inventory: Map[Int,Product],Id:Int): Unit = {
        
            if(inventory.contains(Id)){
                val product=inventory(Id) 
                println(s"Product found: ID: $Id, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}")

            }
            else{
                println(s"product with ${Id} not found")
            }
        
    }





    //calling functions
    println("Product names in inventory 1: " +retrieveNames(inventory1).mkString(", "))
    println(f"Total value of all products in inventory 1: Rs.${totalValue(inventory1)}%.2f")
    println("Is inventory 1 empty: " + isempty(inventory1))
    println("Merged inventory: \n" + format(mergeInventory(inventory1,inventory2)))
    checkProduct(inventory1,1002)



}