package scala

object PermMissingElement {
  def solution(A: Array[Int]): Int = {
    val orderedNumbers = List.range(1, A.length + 2)
    val keys = collection.mutable.Set(A.toStream.toSeq: _*)

    var missingValue = orderedNumbers.reverse.head + 1
    for (number <- orderedNumbers) {
      if (!keys.contains(number)) {
        missingValue = number
      }
    }
    missingValue
  }

  def main(args: Array[String]): Unit = {
    println(solution(Array(1, 2, 3, 5)))
    println(solution(Array(1)))
    println(solution(Array(1, 3)))
    println(solution(Array(1, 2, 3)))
  }
}