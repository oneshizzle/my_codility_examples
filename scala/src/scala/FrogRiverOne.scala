package scala

object FrogRiverOne {

  def solution(X: Int, A: Array[Int]): Int = {
    var positions = collection.mutable.HashMap[Integer, Integer]()
    for (sec <- 0 to A.length - 1) {
      if (!positions.contains(A(sec))) {
        positions.put(A(sec), sec)
      }
    }

    if (positions.keySet.size >= X && positions.contains(X)) {
      // filter in cases there is an extra leaf beyond the shore..
      // the assumptions said otherwise just in case
      positions.filter(_._1 <= X).values.toList.sorted.last
    } else {
      -1
    }
  }

  def main(args: Array[String]): Unit = {
    println(solution(4, Array(3, 2, 1, 2, 4, 5)))
    println(solution(5, Array(1, 3, 1, 4, 2, 3, 5, 4)))
    println(solution(4, Array(3, 2, 1)))
    println(solution(3, Array(1, 3, 1, 3, 2, 1, 3)))
    println(solution(1, Array(1)))
    println(solution(1, Array()))
  }
}