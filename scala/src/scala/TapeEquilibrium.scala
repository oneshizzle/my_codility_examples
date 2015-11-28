package scala

object TapeEquilibrium {
 
  def solution(A: Array[Int]): Int = {
    var minimum = Integer.MAX_VALUE
 
    val maxSum = A.toStream.toList.foldLeft(0)(_ + _)
    var leftSum = 0
   
    for (index <- 0 to A.length - 2) {
      leftSum = leftSum + A(index)
      minimum = Math.min(Math.abs(leftSum - (maxSum - leftSum)), minimum)
    }
 
    return minimum
  }
 
  def main(args: Array[String]): Unit = {
    println(solution(Array(3, 1, 2, 4, 3)))
  }
 
}
