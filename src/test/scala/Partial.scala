
class Partial {

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C
  = (b: B) => f(a, b)


  def curry[A, B, C](f: (A, B) => C): A => (B => C)
  = (a: A) => {
    (b: B) => f(a, b)
  }


  def uncurry[A, B, C](f: A => (B => C)): (A, B) => C
  = (a: A, b: B) => {
    f(a)(b)
  }


  def compose[A,B,C](f: B => C, g: A => B): A => C
  = (a: A) => f(g(a))
}


object Transform{
   def transform(): Int = {
     val inner = (x: Int) => 2*x // <--- call this first

     val outer = (y: Int) => y/5
     val composed = inner andThen( outer ) // The output of inner will be the input of outer

     composed(300)
   }

  def transform2(): Int = {
    val outer = (x: Int) => 2*x

    val inner = (y:Int) => y/5  // <=== call inner then feed the result of inner as input for outer
    val composed = outer compose ( inner )

    composed(300)
  }

  def main(args : Array[String]) ={
      println(transform())
      println(transform2())
  }

}