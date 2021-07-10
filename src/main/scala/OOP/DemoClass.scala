package learn.scala.OOP

class DemoClass(private var name: String, var age: Int) {

  def name_method(): String = {
    name
  }

  def this() {
    this("Test", 0)
    println("this is from 1st auxiliary constructor")
  }

  def this(name: String) {
    this(name, 36)
    println("this is from 2nd auxiliary constructor")
  }

  def this(age: Int) {
    this("Test", age)
    println("this is from 3rd Auxiliary Constructor")
  }

}
object DemoObject {

  def main(args: Array[String]): Unit = {

    var newObject1 = new DemoClass("Max", 34)
    println(s"${newObject1.name_method()} is ${newObject1.age} years old")

    var newObject2 = new DemoClass("Maximum", 35)
    println(s"${newObject2.name_method()} is ${newObject2.age} years old")

    var newObject3 = new DemoClass()
    println(s"${newObject3.name_method()} is ${newObject3.age} years old")

    var newObject4 = new DemoClass("Amy")
    println(s"${newObject4.name_method()} is ${newObject4.age} years old")

    var newObject5 = new DemoClass(37)
    println(s"${newObject5.name_method()} is ${newObject5.age} years old")

  }

}