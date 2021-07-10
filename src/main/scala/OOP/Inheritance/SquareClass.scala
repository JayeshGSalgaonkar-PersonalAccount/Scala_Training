package learn.scala
package OOP.Inheritance

class SquareClass (oneSide: Double) extends ShapesClass {
  override def area(): Double = {
    return oneSide * oneSide
  }
}
