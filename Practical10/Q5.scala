object Lettercount extends App{

    def countLetterOccurrences(word:List[String]):Int={
        val wordlen=word.map(_.length)

        val totletters=wordlen.reduce(_+_)

        totletters
    }

    val words=List("apple", "banana", "cherry", "date")
    val totalCount=countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalCount")
}




























































