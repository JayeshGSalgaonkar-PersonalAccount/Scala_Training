package learn.scala

object Demo10 {

  def main(args: Array[String]): Unit = {

    def sum(x: Int) = (y: Int) => x + y

    println(sum(5)(8))

    def sum2 = sum(40)

    println(sum2(100))

    def sum3(x: Int)(y: Int) = x + y

    println(sum3(4)(5))

    var sum50 = sum3(50) _
    println(sum50(90))


  }

}
