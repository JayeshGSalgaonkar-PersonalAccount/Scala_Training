package learn.scala
package OOP.Abstraction

class RectangleClass (width: Double, height: Double)  extends ShapesClass {

  override def area() : Double = {
    return width * height
  }

//  Class 'RectangleClass' must either be declared abstract or implement abstract member 'area(): Double' in 'learn.scala.OOP.Abstraction.ShapesClass'
}

