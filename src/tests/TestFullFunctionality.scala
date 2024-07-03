package tests
import calculator.model.Calculator
import org.scalatest.FunSuite
class TestFullFunctionality  extends FunSuite {

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  // Example test case
  test("Enter Numbers Test") {
    val calculator: Calculator = new Calculator()

    calculator.numberPressed(9)
    calculator.numberPressed(0)
    calculator.numberPressed(1)
    assert(equalDoubles(calculator.displayNumber(), 901.0), calculator.displayNumber())

    calculator.clearPressed()





    calculator.numberPressed(9)
    calculator.decimalPressed()
    calculator.numberPressed(3)
    calculator.decimalPressed()
    calculator.numberPressed(2)
    assert(equalDoubles(calculator.displayNumber(), 9.32), calculator.displayNumber())

    calculator.clearPressed()



    calculator.numberPressed(11)
    calculator.multiplyPressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 22.0), calculator.displayNumber())


    calculator.clearPressed()


    calculator.clearPressed()
    calculator.decimalPressed()
    calculator.numberPressed(1)
    calculator.numberPressed(9)
    assert(equalDoubles(calculator.displayNumber(), .19), calculator.displayNumber())

    calculator.clearPressed()


    calculator.numberPressed(1)
    calculator.numberPressed(0)
    calculator.numberPressed(0)
    calculator.dividePressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 20.0), calculator.displayNumber())

    calculator.clearPressed()


    calculator.numberPressed(5)
    calculator.decimalPressed()
    calculator.numberPressed(7)
    calculator.numberPressed(5)
    calculator.dividePressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 2.875), calculator.displayNumber())









    calculator.clearPressed()
    calculator.numberPressed(1)
    calculator.numberPressed(0)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.decimalPressed()
    calculator.addPressed()
    calculator.decimalPressed()
    calculator.numberPressed(5)
    calculator.multiplyPressed()
    calculator.numberPressed(3)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 33.0), calculator.displayNumber())


    calculator.clearPressed()
    calculator.numberPressed(2)
    calculator.addPressed()
    calculator.numberPressed(3)
    calculator.multiplyPressed()
    calculator.numberPressed(4)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 20.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(3)
    calculator.multiplyPressed()
    calculator.addPressed()
    calculator.numberPressed(4)
    calculator.equalsPressed()
    calculator.multiplyPressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 14.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(3)
    calculator.multiplyPressed()
    calculator.addPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 8.0), calculator.displayNumber())

//    calculator.clearPressed()
//    calculator.numberPressed(1)
//    calculator.decimalPressed()
//    calculator.decimalPressed()
//    calculator.numberPressed(2)
//    calculator.decimalPressed()
//    calculator.addPressed()
//    calculator.decimalPressed()
//    calculator.numberPressed(3)
//    calculator.equalsPressed()
//
//    assert(equalDoubles(calculator.displayNumber(), 1.5), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(1)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(2)
    calculator.decimalPressed()
    calculator.addPressed()
    calculator.numberPressed(4)
    calculator.decimalPressed()
    calculator.numberPressed(3)
    calculator.equalsPressed()

    assert(equalDoubles(calculator.displayNumber(), 5.5), calculator.displayNumber())
    calculator.clearPressed()
    assert(equalDoubles(calculator.displayNumber(), 0.0), calculator.displayNumber())
    calculator.numberPressed(9)
    calculator.addPressed()
    calculator.numberPressed(1)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 6.59), calculator.displayNumber())
    calculator.addPressed()
    calculator.dividePressed()
    assert(equalDoubles(calculator.displayNumber(), 6.59), calculator.displayNumber())
  }
}