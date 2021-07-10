package learn.scala

object Demo2 {

  def main(args: Array[String]): Unit ={
    var x = 20

    while (x > 15) {
      println(x)
      x -= 1
    }

    var y = 20
    do{
      println(y)
      y -= 1
    }while ( y > 15)
  }


}
