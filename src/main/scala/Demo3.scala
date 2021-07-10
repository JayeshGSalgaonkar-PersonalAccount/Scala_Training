package learn.scala

object Demo3 {

  def main(args: Array[String]): Unit = {

    for (i <- 0.to(5)) {
      println("i using to " + i)
    }

    for (i <- 0.until(8)) {
      println("i using until " + i)
    }

    for (i <- 1 to 9; j <- 1 to 3) {
      println("i and j using multiple ranges " + i + " " + j)
    }

    var lst = List(1, 2, 3, 4, 3, 2, 2, 3, 2, 2, 2, 2, 2)

    for (i <- lst) {
      println(" i using list " + i)
    }

    for (i <- lst; if i == 2) {
      println(" i using list & filter " + i)
    }

    //    for loop as an expression
    val result = for {i <- 1.to(6)} yield {
      i
    }
    println("results is " + result)
  }
}
