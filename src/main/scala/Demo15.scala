package learn.scala

object Demo15 {

  val myMap0 = Map(1 -> "One", 2 -> "Two", 3 -> "Three", 3 -> "Threeeeeee")
  var myMap1 = Map(4 -> "Four", 5 -> "Five", 6 -> "Six")

  def main(args: Array[String]): Unit = {

    println(myMap0)
    println(myMap1)

    println(myMap0.keys)
    println(myMap0.values)
    println(myMap1.keys)
    println(myMap1.values)

    for (x <- myMap1.keys) {
      println(x, myMap1(x))
    }

    myMap1.+=(7 -> "Seven", 8 -> "Eight")
    println(myMap1)

  }

}
