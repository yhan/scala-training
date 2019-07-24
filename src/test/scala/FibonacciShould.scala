import org.scalatest.FunSuite

import scala.annotation.tailrec
import scala.language.postfixOps

class FibonacciShould extends FunSuite {
  test("fibonacci") {
    assertResult(5)(FibonacciCalc.f(5))
  }

  test("fibonacci tail recursion") {
    assertResult(5)(FibonacciTailRecursive.fib(5))
  }
}



object FibonacciCalc {
  // @tailrec // <== RECURSION CALL NOT IN TAIL POSITION
  def f(index: Int): Int = {

    if (index == 0) return 0
    if (index == 1) return 1

    return f(index - 1) + f(index - 2)
  }
}


/**
  * The `fibHelper` code comes from this url: rosettacode.org/wiki/Fibonacci_sequence#Scala
  */
object FibonacciTailRecursive  {

  def fib(x: Int): BigInt = {
    @tailrec def fibHelper(x: Int, prev: BigInt = 0, current: BigInt = 1): BigInt = x match {
      case 0 => prev
      case 1 => current
      case _ => fibHelper(x - 1, current, prev + current)
    }

    fibHelper(x)
  }

}
