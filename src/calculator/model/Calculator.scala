package calculator.model


class Calculator() {

  var state: State =new numPressed(num = this)
  var LHS: String = ""
  var LHS2: Double = 0.0
  var displayNum: Double = 0.0
  var RHS: String = ""
  var RHS2: Double = 0.0
  //  var operation: (Double,Double) => Double = (x: Double, y:Double) => x*y

  // Accessed by View. You should edit this method as you build functionality
  def displayNumber(): Double = {
    this.state.displayNumber()
  }

  def clearPressed(): Unit = {
    this.state.clearPressed()
  }

  def numberPressed(number: Int): Unit = {
    this.state.numberPressed(number)
  }

  def dividePressed(): Unit = {
    this.state.dividePressed()
  }

  def multiplyPressed(): Unit = {
    this.state.multiplyPressed()
  }

  def subtractPressed(): Unit = {
    this.state.subtractPressed()
  }

  def addPressed(): Unit = {
    this.state.addPressed()
  }

  def equalsPressed(): Unit = {
    this.state.equalsPressed()
  }

  def decimalPressed(): Unit = {
    this.state.decimalPressed()
  }


}
