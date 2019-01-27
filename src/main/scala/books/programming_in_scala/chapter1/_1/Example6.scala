package books.programming_in_scala.chapter1._1

import org.scalatest._
import org.scalatest.concurrent.Eventually

object Example6 extends Eventually with Matchers {
  def main(args: Array[String]): Unit = {
    val name = "abcdefg"
    val nameHasUpperCase = name.exists(_.isUpper)
    println(nameHasUpperCase)
  }
}
