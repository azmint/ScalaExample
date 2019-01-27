package books.programming_in_scala.chapter1._3

object Example2 {
  def main(args: Array[String]): Unit = {
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    /*
    threeFour側のメソッド。
    末尾が「:」で終わるメソッドは右側から呼び出される。
    ::メソッドは、先頭に１要素を追加、:::メソッドは、先頭にListを追加する。
     */
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwo + " and " + threeFour + " were not mutated.")
    println("Thus, " + oneTwoThreeFour + " is a new list.")
  }
}
