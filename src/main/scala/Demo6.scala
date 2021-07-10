package learn.scala

object Demo6 {

  def main(args: Array[String]): Unit ={
    println(sumx(5, 8))
  }

  var sumx: (Int, Int) => Int = (x: Int, y: Int) => x + y

}
