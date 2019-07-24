package example

object Main extends App with MapExample {
  def factorial(x: BigInt): BigInt = {
    if (x == 0) {
      1
    }
    else {
      factorial(x - 1) * x
    }
  }
}

