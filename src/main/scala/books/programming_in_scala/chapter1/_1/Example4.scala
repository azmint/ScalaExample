package books.programming_in_scala.chapter1._1

import org.scalatest._
import org.scalatest.concurrent.Eventually

object Example4 extends Eventually with Matchers {
  def main(args: Array[String]): Unit = {
    val xs = 1 to 3
    val it = xs.iterator
    eventually {
      it.next() shouldBe 3
    }
  }
}
