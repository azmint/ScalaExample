package books.programming_in_scala.chapter1._2

object Example1 {
  def main(args: Array[String]): Unit = {
    val result = sample(6, 5)
    println(result)
  }

  def sample(x: Int, y: Int): Int = if (x > y) x else y
}
