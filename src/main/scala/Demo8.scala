package learn.scala

import java.util.Date

object Demo8 {

  def log1 (date : Date, message : String): Unit = {
    println(date + "  " + message)
  }

  def main(args: Array[String]): Unit = {

    def sum = (x:Int, y:Int, z:Int) => x + y + z
    def f = sum(50, 60, _:Int)
    println(f(170))

    var date = new Date()
    var newlog1 = log1(date, _:String)
    newlog1(" - Message 1")
    newlog1(" - Message 2")
    newlog1(" - Message 3")

  }


}
