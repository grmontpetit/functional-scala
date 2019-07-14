package monoid

object Main {

  def main(args: Array[String]): Unit = {

  }

}

object MonoidInstances {


  implicit val intMonoid: Monoid[Int] = new Monoid[Int] {
    override def identity: Int = 0

    override def compose(x: Int, y: Int): Int = x + y
  }

  implicit val stringMonoid: Monoid[String] = new Monoid[String] {
    override def identity: String = ""

    override def compose(x: String, y: String): String = x + y
  }
}

trait Monoid[A] {

  def identity: A

  def compose(x: A, y: A): A
}