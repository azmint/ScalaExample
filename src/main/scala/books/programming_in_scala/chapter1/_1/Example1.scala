package books.programming_in_scala.chapter1._1

object Example1 {
  def main(args: Array[String]): Unit = {
    var capital = Map(
      "US" -> "Washington",
      "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital("France"))
  }
}
