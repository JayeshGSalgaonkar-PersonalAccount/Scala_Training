package learn.scala

object Demo12 {

  def main(args: Array[String]): Unit = {

    var myArray: Array[Int] = new Array[Int](5)
    var myArray1 = new Array[Double](5)
    var myArray2 = Array(1, 2, 3, 4, 5, 6)

    myArray(0) = 10
    myArray(1) = 20
    myArray(2) = 30
    myArray(3) = 40
    myArray(4) = 50

    println(myArray.mkString("Array(", ", ", ")"))

    for (x <- myArray)
      println(x)

    println(myArray1.mkString("Array(", ", ", ")"))

    println(myArray2.length)

    println("--------------------------------------")

    val myArray4 = myArray.concat(myArray2)
    println(myArray4.mkString("Array(", ", ", ")"))

    myArray.update(4, 60)
    println(myArray.mkString("Array(", ", ", ")"))

    println(myArray.sum)

    println(myArray.intersect(myArray4).mkString("Array(", ", ", ")"))

    myArray2(6) = 70
    println(myArray2.mkString("Array(", ", ", ")"))
  }

}
