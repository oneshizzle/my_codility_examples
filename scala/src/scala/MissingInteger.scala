package scala

object MissingInteger {
  def solution(A: Array[Int]): Int = {
    val positiveNumbers = collection.mutable.Set(A.toStream.distinct.filter(f => f > 0): _*)
    val keys = collection.mutable.Set(List.range(1, A.length + 2): _*)
  
    for (key <- positiveNumbers) {
      keys.remove(key)
    }
 
    if (keys.size > 0)
      keys.toList.sorted.head
    else
      0
  }
 
  def main(args: Array[String]): Unit = {
    println(solution(Array(-5, 1, 2, 3, -4)))
    println(solution(Array(-5)))
    println(solution(Array(1, 1)))
    println(solution(Array(1, 2, 3)))
  }
}