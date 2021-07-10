package learn.scala
package OOP.Trait

class RectangleClass(width: Double, height: Double) extends ShapesClass with ColorsClass {

  override def area() : Double = {
    return width * height
  }

  override def color(): String = return "green"

//  Class 'ColorsClass' needs to be trait to be mixed in
}

