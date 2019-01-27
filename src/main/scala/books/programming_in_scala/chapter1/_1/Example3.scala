package books.programming_in_scala.chapter1._1

import java.math.BigInteger

object Example3 {
  def main(args: Array[String]): Unit = {
    val result = factorial(BigInteger.valueOf(3))
    println(result)
  }

  def factorial(x: BigInteger): BigInteger =
    if (x == BigInteger.ZERO)
      BigInteger.ONE
    else
      x.multiply(factorial(x.subtract(BigInteger.ONE)))
}
