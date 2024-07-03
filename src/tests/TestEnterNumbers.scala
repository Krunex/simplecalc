package tests

import calculator.model.Calculator
import org.scalatest.FunSuite

class TestEnterNumbers extends FunSuite {

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  // Example test case
  test("Enter Numbers Test") {
    val calculator: Calculator = new Calculator()

    calculator.numberPressed(1)
    calculator.numberPressed(2)
    calculator.numberPressed(5)

    assert(equalDoubles(calculator.displayNumber(), 125.0), calculator.displayNumber())





    calculator .clearPressed()



    calculator.decimalPressed()
    calculator.numberPressed(1)
    calculator.numberPressed(9)
    assert(equalDoubles(calculator.displayNumber(), .19), calculator.displayNumber())

    calculator.clearPressed()





    calculator.numberPressed(6)
    calculator.addPressed()
    calculator.numberPressed(7)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 13), calculator.displayNumber())


    calculator.clearPressed()


    calculator.numberPressed(10)
    calculator.dividePressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 2.0), calculator.displayNumber())

    calculator.clearPressed()

    calculator.numberPressed(10)
    calculator.addPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 15.0), calculator.displayNumber())

    calculator.clearPressed()

    calculator.numberPressed(10)
    calculator.subtractPressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 5.0), calculator.displayNumber())

    calculator.clearPressed()

    calculator.numberPressed(5)
    calculator.multiplyPressed()
    calculator.numberPressed(4)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 20.0), calculator.displayNumber())

    calculator.clearPressed()


    calculator.numberPressed(10)
    calculator.numberPressed(0)
    calculator.dividePressed()
    calculator.numberPressed(5)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 20.0), calculator.displayNumber())

    calculator.clearPressed()

    calculator.numberPressed(9)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(8)
    calculator.decimalPressed()
    calculator.addPressed()
    calculator.numberPressed(4)
    calculator.decimalPressed()
    calculator.numberPressed(3)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 14.1), calculator.displayNumber())

    calculator.clearPressed()





  }

}
