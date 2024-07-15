import scala.io.StdIn.readLine

case class Book(title: String, author: String, isbn: String)

object Library extends App{

    var library: Set[Book] = Set(
    Book("Madol Duwa", "Martin Wickramasinghe", "1234567890"),
    Book("Famous Five", "Enid Blyton", "0987654321"),
    Book("Kaliyugaya", "Martin Wickramasinghe", "1122334455")
  )

    def addBook(book: Book): Unit={
        library+=book
        println(s"Book added: ${book.title}")
    }

    def removeBook(isbn: String): Unit={
        for(book<-library){
            if(book.isbn==isbn){
                library-=book
            }
            else{
                println(s"No book found with ISBN: $isbn")
            }
        }
    }

    def isBookinLibrary(isbn:String):Unit={
        var flag=0
        for(book<-library){
            if(book.isbn==isbn){
                println(s"Book found with ISBN: $isbn")
                flag=flag+1
            }
        }
        
        if(flag==0){
            println(s" No book found with ISBN: $isbn")
        }
    }

    def display():Unit={
        if(library.nonEmpty){
            println("Current library collection:")
            for (book <- library) {
                println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
        }
        }
        else{
            println("The library is empty.")
        }
    }

    def displayBookbyTitle(title:String):Unit={
        var flag=0
        for(book<-library){
            if(book.title==title){
                println(s"Book found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
                flag=flag+1
            }

            
        }
        if(flag==0){
             println(s" No book found with Title: $title")
        }
    }



    display()

    val newbook=Book("Hath Pana","Kumarathunga Munidasa","225684752")
    addBook(newbook)
    display()

    removeBook("1122334455")
    display()

    isBookinLibrary("225684752")

    displayBookbyTitle("Romeo Juliet")



 
}

