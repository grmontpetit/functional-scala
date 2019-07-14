package monoid.cats

import cats.Monoid
import cats.implicits._

object Main {

  def main(args: Array[String]): Unit = {
    val aList = List(1, 1, 1, 1)
    val combined1 = combineAll(aList)
    assert(combined1 == 4, s"got $combined1 want 4")

    val anotherList = List("a", "b", "c", "d")
    val combined2 = combineAll(anotherList)
    assert(combined2 == "abcd", s"got $combined2 want abcd")

  }

  def combineAll[A: Monoid](as: List[A]): A = as.foldLeft(Monoid[A].empty)(Monoid[A].combine)
}
