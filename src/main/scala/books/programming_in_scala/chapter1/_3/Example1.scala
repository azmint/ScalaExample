package books.programming_in_scala.chapter1._3

object Example1 {
  def main(args: Array[String]): Unit = {
    val greetStrings = new Array[String](3)
    //    greetStrings.update(0, "Hello")
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world\n"
    //    val greetStrings = Array("Hello", ", ", "world!\n")
    //    val greetStrings = Array.apply("Hello", ", ", "world!\n")

    for (i <- 0 to 2)
    //      print(greetStrings.apply(i))
      print(greetStrings(i))
  }
}
