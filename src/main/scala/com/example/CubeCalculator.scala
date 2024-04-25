// Define a custom exception class
case class CustomException(message: String) extends Exception(message)

object CubeCalculator {
  def cube(x: Int) = {
    x * x * x
  }

  def divide(a: Int, b: Int): Int = {
    if (b == 0) {
      throw CustomException("Cannot divide by zero")
    } else {
      a / b
    }
  }

}

// case class Point(x: Int, y: Int)
object IdFactory {
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
  }
}
