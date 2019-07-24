object Demo {
  def main(args: Array[String]) {
    printStrings2(Array[String]("Hello",
      "Scala",
      "Python"));
  }

  def printStrings(args: String*) = {
    var i: Int = 0;
    println("printStrings")
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1;
    }
  }

  def printStrings2(args: Seq[String]): Unit = {
    println("printStrings 2")

    def inner(i: Int): Unit = {
      if (i == args.length) {
        return
      }

      println("Arg value[" + i + "] = " + args(i))

      inner(i + 1)
    }

    inner(0)
  }

}