package learn.scala
package OOP.Abstraction

class SquareClass (oneSide: Double) extends ShapesClass {
  override def area(): Double = {
    return oneSide * oneSide
  }

//  Class 'RectangleClass' must either be declared abstract or implement abstract member 'area(): Double' in 'learn.scala.OOP.Abstraction.ShapesClass'
}
