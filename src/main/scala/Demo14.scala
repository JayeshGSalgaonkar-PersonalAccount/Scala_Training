package learn.scala

import scala.collection.mutable

object Demo14 {

  //  Immutable sets
  val myset: Set[Int] = Set(1, 12, 123, 123, 123, 124, 234, 1, 234)
  val names = Set("Tom", "Dick", "Harry")

  //  Mutable sets
  var myset1: mutable.Set[Int] = scala.collection.mutable.Set(1, 2, 3, 4, 5, 6)

  def main(args: Array[String]): Unit = {

    println(myset)
    println(names)
    println(myset1)

    myset1.add(7)
    println(myset1)

    val myset2 = myset.+(4) + 10
    println(myset2)

    println(myset2.contains(8))

    val myset3 = myset2.concat(myset1)
    println(myset3)

    val myset4 = myset2.intersect(myset1)
    println(myset4)

    myset1.add(8)
    println(myset1)

  }

}
