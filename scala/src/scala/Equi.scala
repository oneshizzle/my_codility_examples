package scala

object Equi {
 
  def solution(A: Array[Int]): Int = {
    var answer = -1
    val max_pivot = A.length - 1
    var leftSum: Long = 0
    var rightSum: Long = 0
 
    val longArray = collection.mutable.ListBuffer(A.toStream.map(entry => entry.toLong): _*)
 
    if (A.length > 0) {
      rightSum = longArray.reduceLeft(_ + _)
    }
 
    for (pivot <- 0 to A.length - 1 if answer < 0) {
      rightSum = rightSum - A(pivot)
 
      if (leftSum == rightSum) {
        answer = pivot
      } else if (max_pivot == pivot && leftSum == 0) {
        answer = pivot
      } else if (pivot == 0 && rightSum == 0) {
        answer = pivot
      }
 
      leftSum = leftSum + A(pivot)
 
    }
    answer
  }
 
  def main(args: Array[String]): Unit = {
 
    println("ANSWER: " + solution(Array(0, 2147483647, 2147483647)))
    println("ANSWER: " + solution(Array(-2147483648, -2147483648, -2)))
    println("ANSWER: " + solution(Array()))
 
    println("ANSWER: " + solution(Array(-1, 3, -4, 5, 1, -6, 2, 1)))
 
    println("ANSWER: " + solution(Array(-1)))
    println("ANSWER: " + solution(Array(-1, -1, 1)))
    println("ANSWER: " + solution(Array(1, 2, -3, 0)))
    println("ANSWER: " + solution(Array(1082132608, 0, 1082132608)))
    println("ANSWER: " + solution(Array(-2147483648, 0, -1, -2147483647)))
 
  }
 
}