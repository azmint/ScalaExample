package books.programming_in_scala.chapter1._2

object Example2 {
  def main(args: Array[String]): Unit = {
    val names = List("ichiro", "jiro", "saburo")
    for (name <- names)
      println(name)
  }
}
