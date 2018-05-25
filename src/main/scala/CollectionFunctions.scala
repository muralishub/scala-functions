package main.scala

object CollectionFunctions extends App{

  def sortInts(xs: List[Int]): List[Int] = {
    if (xs.isEmpty) xs
    else
      insert(xs.head, xs.tail)

  }

  def insert(x: Int, xs: List[Int]): List[Int] = {

    if (xs.isEmpty || x <= xs.head) x :: xs
    else {
      insert(xs.head, sortInts(x :: xs.tail))
    }
  }

  //using pattern matching

  def sorting(xs: List[Int]): List[Int] = {
    xs match {
      case Nil => xs
      case _ => inserting(xs.head, sorting(xs.tail))
    }
  }

  def inserting(x: Int, xs: List[Int]): List[Int] = {

    xs match {
      case List() => List(x)
      case y :: ys => if (x <= y)  x :: xs
      else  y :: inserting(x, ys)
    }
  }


  def append(xs: List[Int], ys: List[Int]): List[Int] = {
    ys match {
      case Nil => xs
      case y :: Nil => xs :+ y
      case y :: yy => append(xs :+ y, yy)

    }
  }


}
