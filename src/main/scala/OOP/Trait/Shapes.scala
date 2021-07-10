package learn.scala
package OOP.Trait

abstract class ShapesClass() {
   def area() : Double
}

trait ColorsClass {
  def color() : String
}

object ShapesObject {

  def main(args: Array[String]): Unit = {

//    var obj1 = new ShapesClass
//    println(obj1.area())


    var obj_Squ = new SquareClass(10)
    println(obj_Squ.area())
    println(obj_Squ.color())

    var obj_Rec = new RectangleClass(55.0, 14.0)
    println(obj_Rec.area())
    println(obj_Rec.color())

  }


}
