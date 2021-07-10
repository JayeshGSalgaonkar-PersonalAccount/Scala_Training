package learn.scala
package OOP.Encapsulation

class Shape(private var len: Double = 90.00, var breadth: Double = 100.00, var height: Double = 80.00) {

  def length(): Unit = print(len)
}

object Encapsulation {

  def main ( args: Array[String]): Unit = {

    var obj1 = new Shape()

    println(obj1.breadth)
    println(obj1.height)
    obj1.length()

//    The private argument of class Shape is not available to access at obj1 level.
//    Accessible only by means of defining length() method
  }


}
