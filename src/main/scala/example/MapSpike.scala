package example

object MapSpike extends App{
  def find(key: String) ={
    var map = Map("france" -> "paris", "US" -> "washington")
    map+=("china" -> "beijing")

    map(key)
  }
}
