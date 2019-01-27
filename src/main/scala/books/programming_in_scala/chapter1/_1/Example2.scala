package books.programming_in_scala.chapter1._1

object Example2 {
  def main(args: Array[String]): Unit = {
    val result = factorial(3)
    println(result)
  }

  def factorial(x: BigInt): BigInt = if (x == 0) 1 else x * factorial(x - 1)
}
