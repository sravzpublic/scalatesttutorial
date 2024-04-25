class PointTest extends org.scalatest.funsuite.AnyFunSuite {
  test("Point settings") {
    var point = new Point(1, 2)
    assert(point.x == 1)
    assert(point.y == 2)
  }

}
