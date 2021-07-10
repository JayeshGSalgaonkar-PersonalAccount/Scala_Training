package learn.scala

object HelloWorld {

  def main(args: Array[String]): Unit = {

    var name = "mark"
    var age = 18.5

    println(name + " is " + age + " years old")
    println(s"$name is $age years old")
    println(f"$name%s is $age%.2f years old")
    println(raw"$name%s is $age%.2f years old \n Test")
  }
}