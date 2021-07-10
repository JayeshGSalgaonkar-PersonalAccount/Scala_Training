package learn.scala
package OOP.Overloading

object Overloading {

  def main(args: Array[String]): Unit = {

    println(areaOfSquare(8.0, 8.0)) // double
    println(areaOfSquare(9.0,9.0)) // float
    println(areaOfSquare(10,10)) // int

  }

  def areaOfSquare(length: Int, breadth: Int): Int = {
    return length * breadth
  }

  def areaOfSquare(length: Double, breadth: Double): Double = {
    return length * breadth
  }

  def areaOfSquare(length: Float, breadth: Float): Float = {
    return length * breadth
  }

}
