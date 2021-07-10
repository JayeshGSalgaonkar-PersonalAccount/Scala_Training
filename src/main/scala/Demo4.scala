package learn.scala

object Demo4 {

  def main(args: Array[String]): Unit ={

    var age = 50
// match case as statement
    age match {

      case 10 => println("between 0 and 10")
      case 20 => println("Twenty")
      case 30 => println("Thirty")
      case _ => println("Out of range")

    }
// match case as expression

    var result = age match {
      case 50 => age
      case 60 => age
    }
    println(result)

//   match case as expression type 2

    var i = 1

    i match {
      case 1 | 3 | 5 | 7 | 9 => println("odd")
      case 2 | 4 | 6 | 8 => println("even")
    }



  }

}
