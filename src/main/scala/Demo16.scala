package learn.scala

object Demo16 {

  val myTuple = (1, 2, "Test", true, false)
  val myTupel1 = Tuple3("Hello", "World", (2,3))

  def main (args: Array[String]): Unit = {

    println(myTuple)

    println(myTuple._1)
    println(myTuple._2)
    println(myTuple._3)
    println(myTuple._4)
    println(myTuple._5)

    println(s" ${myTupel1._1} ${myTupel1._2}")

    for (x <- myTuple.productIterator) {
      println(x)
    }

    println(myTupel1._3._2)



  }

}
