package learn.scala

class Strict {

  var s: Unit = {
    println("strict")
  }

}

class LazyEval {
  lazy val l: Unit = {
    println("lazy")
  }

}

object Demo18 {

  def main (args: Array[String]): Unit = {

    var obj1 = new Strict
    var obj2 = new LazyEval

    obj2.l

  }



}
