package books.programming_in_scala.chapter1._1

object Example5 {
  def main(args: Array[String]): Unit = {
    val a = new MyClass(1, "")
    a.index = 2
    println(a.index)
  }
}

class MyClass(var index: Int, var name: String) {
}
