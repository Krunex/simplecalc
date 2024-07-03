package calculator.model

class Add(num: Calculator) extends State(num) {

  override def displayNumber(): Double = {
    num.displayNum
  }

  override def clearPressed(): Unit = {
    num.LHS = ""
    num.LHS2 = 0
    num.displayNum = 0
    num.RHS = ""
    num.RHS2 = 0
    num.state = new numPressed(num)
  }

  override def numberPressed(number: Int): Unit = {
//    num.displayNum = 0
////    num.LHS2 = num.LHS2 + num.RHS2
////    num.displayNum = num.LHS2
//    num.RHS = ""
//    num.RHS2 = 0
    num.RHS = num.RHS + number.toString
    num.RHS2 = num.RHS.toDouble
    num.displayNum = num.RHS2
//    num.state = new RHS(num)
  }

  override def dividePressed(): Unit = {
    num.LHS2 = num.LHS2 + num.RHS2
    num.displayNum = num.LHS2
    num.LHS=num.LHS2.toString
    num.RHS = ""
    num.RHS2 = 0
    num.state = new Divs(num)

  }

  override def multiplyPressed(): Unit = {
    num.LHS2 = num.LHS2 + num.RHS2
    num.displayNum = num.LHS2
    num.LHS=num.LHS2.toString
    num.RHS = ""
    num.RHS2 = 0
    num.state = new Mult(num)
  }

  override def subtractPressed(): Unit = {
    num.LHS2 = num.LHS2 + num.RHS2
    num.displayNum = num.LHS2
    num.LHS=num.LHS2.toString
    num.RHS = ""
    num.RHS2 = 0
    num.state = new Sub(num)

  }

  override def addPressed(): Unit = {
    num.state = new Add(num)
    num.LHS2 = num.LHS2 + num.RHS2
    num.displayNum = num.LHS2
    num.LHS=num.LHS2.toString
    num.RHS = ""
    num.RHS2 = 0
    num.state = new Add(num)
  }

  override def equalsPressed(): Unit = {
    num.LHS2 = num.LHS2 + num.RHS2
    num.displayNum = num.LHS2
    num.LHS=num.LHS2.toString
    num.RHS = ""
    num.RHS2 = 0
    num.state = new numPressed(num)
  }

  override def decimalPressed(): Unit = {
    num.RHS = num.RHS + "."
    num.state = new DecimalAdd(num)

  }

}
