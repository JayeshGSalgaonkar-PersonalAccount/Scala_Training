package learn.scala
package OOP.Trait

class SquareClass(oneSide: Double) extends ShapesClass with ColorsClass {
  override def area(): Double = {
    return oneSide * oneSide
  }

  override def color(): String = return "yellow"

//  Class 'ColorsClass' needs to be trait to be mixed in
}
