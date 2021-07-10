package learn.scala

object Demo7 {

  def main(args: Array[String]): Unit ={

    println(math(4, 5, 8, _ - _))
    println(math1(15, 5, 2, Functions))
    println(math2(3, 4, Functions))

  }

  def math(x: Int, y: Int, z: Int, f: (Int, Int) => Int) : Int = f(f(x,y),z)

  def math1(x: Double, y: Double, z: Double, f: Functions.type ) : Double = Functions.subtract(Functions.subtract(x, y), z)

  def math2(x: Double, y: Double, f: Functions.type ) : Double = Functions.*(x, y)

}
