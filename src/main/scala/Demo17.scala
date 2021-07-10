package learn.scala

object Demo17 {

  var myList = List(1, 2, 3, 4, 5, 6)
  var myMap = Map(1 -> "One", 2 -> "Two", 3 -> "Three")

  def main(args: Array[String]): Unit = {


    // Options
    println(myList.find(_ > 3).get)
    println(myMap.getOrElse(5, "Not in Range"))

    //  Map
    println(myList.map(_ + 2))
    //    println(myList.map((x: Int) => x, x+2))
    println(myList.map(_ % 2 == 0))
    println(myMap.map(_._2 + "_mapTest"))

    //  Flatten method to combine list of lists

    var myListofList = List(List(1, 2, 3), List(3, 4, 5, 6))
    println(myListofList.flatten)

    // FlatMap
    println(myList.flatMap((x: Int) => List(x, x + 2)))
    println(myList.map((x: Int) => List(x, x + 2)))

    //    Filter using predicate
    println(myList.filter(x => x % 2 == 0))

    //    Reduce left or right - binary operator -> a function which work on 1st 2 element and result of which is passed to 3rd element and so on..
    println(myList.reduceLeft((a, b) => a * b + b * a))

    myList.reduceRight((x, y) => {
      println(x + "_" + y);
      x + y
    })
    myList.reduceLeft((x, y) => {
      println(x + "_" + y);
      x + y
    })

    var myList1 = List("A", "B", "C")
    println(myList1.reduceLeft(_ + _))


    //    Fold left or right - difference is we can pass initial argument here

    myList.foldLeft(5)((x, y) => {
      println(x + "," + y);
      x + y
    })
    myList.foldLeft(5)((x, y) => {
      println(x + "," + y);
      x - y
    })

    myList.foldRight(5)((x, y) => {
      println(x + "," + y);
      x + y
    })
    myList.foldRight(5)((x, y) => {
      println(x + "," + y);
      x - y
    })


    //    Scan left or right - same as fold, but it gives map of intermediate folds - its always a list

    println(myList.scanLeft(100)(_+_))
    println(myList.scanRight(100)(_+_))


  }

}
