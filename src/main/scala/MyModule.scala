

object MyModule {
  def absolute (number: Int) : Int = {
    if(number < 0)
      -number
    else
      number
  }

  private def format(number: Int) ={
    var message = "The absolute value of %d is %d"
    message.format(number, absolute(number))
  }

  def main(args : Array[String]) ={
    println(format(-42))
  }

}



