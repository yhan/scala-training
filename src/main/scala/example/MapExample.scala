package example

trait MapExample {

  def map = {
    var capital = Map(1 -> "Washington", 2 -> "Paris")
    capital += (3 -> "Tokyo")
    println(capital(3))
  }
}
