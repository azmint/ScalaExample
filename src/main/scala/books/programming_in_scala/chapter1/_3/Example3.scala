package books.programming_in_scala.chapter1._3

object Example3 {
  def main(args: Array[String]): Unit = {
    /*
    空リストの作成
     */
    val empty1 = List()
    val empty2 = Nil

    /*
    要素を指定してリストを作成する
     */
    val list = List("Cool", "tools", "rule")

    /*
    ３つの値を連結してリストを作成する
     */
    val thrill = "Will" :: "fill" :: "until" :: Nil

    /*
    ２つのリストを連結する
     */
    val combinedlist = List("a", "b") ::: List("c", "d")

    /*
    添字の要素を返す
     */
    val until = thrill(2)

    /*
    長さが4の要素の数を返す
     */
    val count = thrill.count(s => s.length == 4)

    /*
    先頭の２要素を取り除く
     */
    val dropedList = thrill.drop(2)

    /*
    末尾の２要素を取り除く
     */
    val dropedRightList = thrill.dropRight(2)

    /*
    指定した要素が含まれるか確認する
     */
    val containsUntil = thrill.contains("until")
    val existsLengthOver4 = thrill.exists(s => s.length >= 4)

    /*
    抽出
     */
    val lengthOver4List = thrill.filter(s => s.length == 4)

    /*
    全ての要素が述語に当てはまるか確認する
     */
    val isAllEndsWithL = thrill.forall(s => s.endsWith("l"))
  }
}
