import org.graalvm.compiler.graph.Node.Input

class Immutable{
  private def process(input: Int) : Boolean = {
    if (input < 0) {
      return false
    }
    true
  }

  def returnTuple(x: String): (String, String, Boolean) = {
    val r1 = x.reverse
    val r2 = x.reverse

    val result = new Immutable().process(42)
    (r1, r2, result)
  }
}