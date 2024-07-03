package calculator.model

class DecimalMult(num: Calculator) extends State(num) {
  override def displayNumber(): Double = {
    num.displayNum
  }

  override def clearPressed(): Unit = {
    num.RHS = ""
    num.RHS2 = 0
    num.displayNum = 0.0
    num.state = new numPressed(num)
  }

  override def numberPressed(number: Int): Unit = {
    num.RHS = num.RHS + number.toString
    //    num.state = new dispNumber(num)
    num.RHS2 = num.RHS.toDouble
    num.displayNum = num.RHS2
  }

  override def dividePressed(): Unit = {
    //    num.LHS2 = num.LHS2 * num.RHS2
    num.displayNum = num.LHS2
    num.RHS = ""
    num.LHS=num.LHS2.toString
    num.RHS2 = 0
    num.state = new Divs(num)

  }

  override def multiplyPressed(): Unit = {
//    num.state = new Mult(num)
    //    num.LHS2 = num.LHS2 * num.RHS2
        num.displayNum = num.LHS2
        num.LHS=num.LHS2.toString
        num.RHS = ""
        num.RHS2 = 0
        num.state = new Mult(num)
  }

  override def subtractPressed(): Unit = {
    //    num.LHS2 = num.LHS2 * num.RHS2
    num.displayNum = num.LHS2
    num.RHS = ""
    num.LHS=num.LHS2.toString
    num.RHS2 = 0
    num.state = new Sub(num)
  }

  override def addPressed(): Unit = {
    //    num.LHS2 = num.LHS2 * num.RHS2
    num.displayNum = num.LHS2
    num.RHS = ""
    num.LHS=num.LHS2.toString
    num.RHS2 = 0
    num.state = new Add(num)
  }

  override def equalsPressed(): Unit = {
    num.LHS2 = num.LHS2 * num.RHS2
    num.displayNum = num.LHS2
    num.LHS=num.LHS2.toString
    num.RHS = ""
    num.RHS2 = 0
  }

  override def decimalPressed(): Unit = {
  }

}
