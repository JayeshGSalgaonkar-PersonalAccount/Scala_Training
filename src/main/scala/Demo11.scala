package learn.scala

object Demo11 {

  def main(args: Array[String]) {

    val str = "STRING"

    println(str.charAt(5))

    println(str.length)

    println(str.concat("text"))

    println(str + " Hello World")

    println("------------------------------------")

    printf("%s\n", str)
    println("%s".format(str))

  }

}
