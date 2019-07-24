import example.{Main, MapSpike}
import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) == 27)
  }

  test("CubeCalculator.cube: test input equals to 0") {
    assert(CubeCalculator.cube(0) == 0)
  }
}


class MapSpikeTest extends FunSuite {
  test("Get value") {
    assert(MapSpike.find("china") == "beijing", "The capital of China should be beijing")
  }
}

class FactorialShould extends FunSuite {
  test("Returns 24 for 4") {
    assertResult(24)(Main.factorial(4))
  }

  test("equals") {
    val immutable = new Immutable()
    val tuple = immutable.returnTuple("hello world")

    assert(tuple._1 == tuple._2, "Should equal")
    assert(tuple._3, "Returned boolean should be True")
  }
}


class ImmutableShould extends  FunSuite{

}
