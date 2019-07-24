import org.scalatest.FunSuite

class FindFirstShould extends FunSuite {
  test("Can find the first element matching predicate") {

//    assertResult(1, findFirst(Array(7, 9, 13), (x: Int) => x == 9))

    assert(1== findFirst(Array(7, 9, 13), (x: Int) => x == 9), "Should find 9 in index 1")

  }

  def findFirst(as: Array[Int], predicate: Int => Boolean): Int = {

    def loop( x: Int): Int =  {
      if(x == as.length ) -1
      else
          if (predicate(as(x))) x
          else loop(x + 1)

    }

    loop(0)
  }

}
