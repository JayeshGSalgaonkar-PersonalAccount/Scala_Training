package learn.scala
package OOP.Abstraction

abstract class ShapesClass() {

   def area() : Double
}

object ShapesObject {

  def main(args: Array[String]): Unit = {

//    var obj1 = new ShapesClass
//    println(obj1.area())
//    Class ShapesClass is Abstract cannot be instantiate

    var obj_Squ = new SquareClass(10)
    println(obj_Squ.area())

    var obj_Rec = new RectangleClass(55.0, 14.0)
    println(obj_Rec.area())

  }


}
