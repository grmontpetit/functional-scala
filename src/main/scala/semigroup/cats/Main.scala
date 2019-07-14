package semigroup.cats

import cats.Semigroup
import cats.implicits._

object Main {

  def main(args: Array[String]): Unit = {

    val aMap1 = Map(1 -> 1, 2 -> 2)
    val aMap2 = Map(1 -> 100, 3 -> 3)

    val merged = mergeMap(aMap1, aMap2)
    val expected = Map(1 -> 101, 3 -> 3, 2 -> 2)
    assert(merged == expected, s"got $merged want $expected")

  }

  def optionCombine[A: Semigroup](a: A, opt: Option[A]): A =
    opt.map(a |+| _).getOrElse(a)

  def mergeMap[K, V: Semigroup](lhs: Map[K, V], rhs: Map[K, V]): Map[K, V] =
    lhs.foldLeft(rhs) {
      case (acc, (k, v)) => acc.updated(k, optionCombine(v, acc.get(k)))
    }

}
