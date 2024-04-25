import org.scalatest.matchers.should.Matchers

class CubeCalculatorTest
    extends org.scalatest.funsuite.AnyFunSuite
    with Matchers {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("CubeCalculator.cube 0 should be 0") {
    assert(CubeCalculator.cube(0) === 0)
  }

  test("throw CustomException when dividing by zero") {
    assertThrows[CustomException] {
      CubeCalculator.divide(10, 0)
    }
  }

  test("no exception thrown when dividing by non-zero") {
    // Verify that no exception is thrown when dividing by a non-zero number
    noException should be thrownBy {
      CubeCalculator.divide(10, 2)
    }
  }

}
