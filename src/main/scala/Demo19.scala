package learn.scala

object Demo19 {

  def method1(n: Int): Unit = {
    println("Method 1")
    println(n)
  }

  def method2(n: => Int): Unit = {
    println("Method 2")
    println(n)
  }

  def main(args: Array[String]): Unit = {
    def add(x: Int, y: Int): Int = {
      println("Addition")
      x + y
    }

    method1(add(5, 7))
//    for method1, first it evaluates the value of "n" method signature, then it executes statements in the method

    method2(add(5, 9))
//    for method2, method signature is with lazy loading rocket sign, SCALA starts executing statements in the method, only when the argument is trigger.. it starts to evaluate add method.
  }

}
