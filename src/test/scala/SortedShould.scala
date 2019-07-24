import org.scalatest.FunSuite
import scala.annotation.tailrec



class TellsSortedShould extends FunSuite {
  test("Can tell if array is sorted") {
    assert(isSorted2(Array(1, 2, 3, 4, 5, 60), (x: Int, y: Int) => x > y), "Array is sorted")
  }

  def isSorted2[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @tailrec
    def loop(x: Int): Boolean = {
      if (x == as.length - 1) true
      else if (ordered(as(x), as(x + 1))) false
      else loop(x + 1)
    }

    loop(0)
  }

  def isSorted(array: Array[Int], ordered: (Int, Int) => Boolean): Boolean = {
    var index = array.length - 1
    if (index == 0) {
      return true
    }

    while (index - 1 >= 0) {
      val compare = ordered(array(index), array(index - 1))
      if (!compare) {
        return false
      }
      index = index - 1 // side effect
    }

    true
  }
}

