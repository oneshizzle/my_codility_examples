package scala

object Nesting {

  def solution(S: String): Int = {
    var i: Integer = 0
    var j: Integer = 0
    for (ch <- S if i - j >= 0) {
      if (ch.toString.equals("(")) {
        i = i + 1
      } else {
        j = j + 1
      }
    }
    if (i - j == 0) 1 else 0
  }

  def main(args: Array[String]) = {
    //Nesting basic test no junit for now
    assert(solution(")(") == 0, "Expected Pass")
    assert(solution(")(") == 1, "Expected Failure")
    //DS2
  }
}

