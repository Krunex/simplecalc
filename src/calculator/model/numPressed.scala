package calculator.model



class numPressed(num: Calculator) extends State(num){

  //////           Initial State             ///////////////////////

  // this is also technically the left hand side (LHS) ///


  override def displayNumber(): Double = {
    num.displayNum
  }

  override def clearPressed(): Unit = {
    num.LHS = ""
    num.LHS2 = 0.0
    num.displayNum = 0.0
  }

  override def numberPressed(number: Int): Unit = {

    // num.LHS = number.toString
    num.LHS = num.LHS + number.toString
    //    num.state = new dispNumber(num)
    num.LHS2 = num.LHS.toDouble
    num.displayNum = num.LHS2
    //    num.LHS = num.LHS + (number * 10+number)
  }

  override def dividePressed(): Unit = {
     num.state = new Divs(num)

  }

  override def multiplyPressed(): Unit = {
    num.state = new Mult(num)

  }

  override def subtractPressed(): Unit = {
     num.state = new Sub(num)
  }

  override def addPressed(): Unit = {
    num.state = new Add(num)
    //    num.operation = (x:Double, y:Double) => x+y
    //    num.state = new Operator(num)
  }

  override def equalsPressed(): Unit = {
    // num.state = new Operator(num)
  }

  override def decimalPressed(): Unit = {
    // this makes it so that when u press the decimal button again, it doesn't work
    num.LHS = num.LHS + "."
    num.state = new initialDec(num)
//    num.state = new DisableDeci(num)


  }


}
