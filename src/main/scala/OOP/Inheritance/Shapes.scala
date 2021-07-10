package learn.scala
package OOP.Inheritance

class ShapesClass() {

  def area(): Double = {
    var a = 0.0
    println("Print from ShapesClass")
    return a
  }
}

object ShapesObject {

  def main(args: Array[String]): Unit = {

//    var obj1 = new ShapesClass
//    println(obj1.area())
//    No need to instantiate SuperClass object, SubClass object is able to access SuperClass methods

    var obj_Squ = new SquareClass(10)
    println(obj_Squ.area())

    var obj_Rec = new RectangleClass(55.0, 14.0)
    println(obj_Rec.area())

  }


}
