// class Point {
class Point(val initalValX: Int, val initialValY: Int) {
  private var _x = initalValX
  private var _y = initialValY
  private val bound = 100

  def x: Int = _x
  def x_=(newValue: Int): Unit = {
    if (newValue < bound)
      _x = newValue
    else
      printWarning()
  }

  def y: Int = _y
  def y_=(newValue: Int): Unit = {
    if (newValue < bound)
      _y = newValue
    else
      printWarning()
  }

  private def printWarning(): Unit =
    println("WARNING: Out of bounds")

  override def toString: String = s"Point(x=$x, age=$y)"

}
