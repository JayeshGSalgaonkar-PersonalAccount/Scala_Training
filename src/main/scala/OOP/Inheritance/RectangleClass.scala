package learn.scala
package OOP.Inheritance

class RectangleClass (width: Double, height: Double)  extends ShapesClass {

  override def area() : Double = {
    return width * height
  }
}

