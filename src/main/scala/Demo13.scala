package learn.scala

import scala.::
import scala.collection.IterableOnce.iterableOnceExtensionMethods

object Demo13 {

  def main (args: Array[String]): Unit = {

    val mylist1 : List[Int] = List(1,2,3,4,2,32,2,2)
    val mylist2 = List(234,234,234,234)
    val names = List("Tom", "Dick", "Harry")

    println(mylist1)
    println(mylist2)
    println(names)

//    use cons to add values to list
    val mylist3 = 0 :: mylist1
    println(mylist3)

    val mylist6 = mylist3.appended(999)
    println(mylist6)

    val mylist4 = mylist1.appended(45)
    println(mylist4)

    println(List.fill(4)(6))





    mylist4.foreach( println)

    var sum = mylist4.sum
    println(sum)

    var mylist5 = mylist1.intersect(mylist4)
    println(mylist5)

    for ( x <- mylist4.indices){
      if (x > 3) {
        println(mylist4(x))
      }

    }


  }

}
