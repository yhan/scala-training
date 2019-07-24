package shapesSpike

class ShapeDrawer(val shape: Shape) {
  def draw = shape match {
    case c:
      Circle => println("Circle.draw: " + c)
    case r:
      Rectangle => println("Rectangle.draw: " + r)
    case t:
      Triangle => println("Triangle.draw: " + t)
  }
}

object ShapeDrawer {
  implicit def shape2ShapeDrawer(shape: Shape) = new ShapeDrawer(shape)
}

case class Point(x: Double, y: Double)

sealed abstract class Shape()

case class Circle(center: Point, radius: Double) extends Shape()

case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape()

case class Triangle(point1: Point, point2: Point, point3: Point) extends Shape()


//class actor {
//  var sum = 0 loop {
//    receive { case Data(bytes) => sum += hash(bytes)
//    case GetSum(requester) => requester ! sum
//    }
//  }
//}

