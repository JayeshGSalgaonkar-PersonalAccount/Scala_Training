package learn.scala

object Functions {

  def add(x: Double = 45.0, y: Double = 25.0): Double = {
    return x + y
  }

  def +(x: Double = 45.0, y: Double = 25.0): Double = {
    return x + y
  }

  def subtract(lhs_number: Double, rhs_number: Double): Double = {
    lhs_number - rhs_number
  }

  def -(lhs_number: Double, rhs_number: Double): Double = {
    lhs_number - rhs_number
  }

  def multiply(lhs_number: Double, rhs_number: Double): Double = lhs_number * rhs_number

  def *(lhs_number: Double, rhs_number: Double): Double = lhs_number * rhs_number

  def divide(lhs_number: Double, rhs_number: Double): Double = lhs_number / rhs_number

  def /(lhs_number: Double, rhs_number: Double): Double = lhs_number / rhs_number

  def square(x: Double) : Double = x*x

//  def square(x: Double) : Double = x*x

  def print(x: Int, y: Int) : Unit = println(s"Value of x = $x & value of y = $y ")

}
