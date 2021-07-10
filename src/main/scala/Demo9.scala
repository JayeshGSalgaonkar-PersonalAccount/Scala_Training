package learn.scala

// Closure is a function which has one or more variables defined outside of this function

object Demo9 {

  var number = 100

  def sum: Int => Int = (x: Int) => x + number

  def main(args: Array[String]): Unit = {

    println(sum(5))

  }

}
