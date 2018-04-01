/**
  * 03 FUNCTIONS IN SCALA
  */


// 03-01 defining a function
  def testMethod(param1: Int, param2: Int):Int = {
    if (param1 > param2) {
      param1
    } else {
      param2
    }
  }
  testMethod(2,3)


// 03-02 one-line-functions
//    small functions can be written in one line in scala
  def testMethod2(param1: Int, param2: Int):Int = if (param1 > param2) param1 else param2


// 03-03 functions with side-effects
  def sideEffMethod() = println("Hello world")
  sideEffMethod()


// 03-05 operator notation
//    All operations are method calls in scala
//    this line actually is the same as the next line
  val operatorNotation = 1 + 2
  val methodNotation = 1.+(2)

//  methods can be called with a space between the params instead of a dot
  case class OperatorExample() {

    def ! (param1: String) = println(param1)

    def !! (param1: String, param2: String) = println(param1 + param2)

  }
  val testOperatorNotation = OperatorExample()

  //    operator notation with a single param
  testOperatorNotation ! "single param"

  testOperatorNotation !! ("param one","param two")


// 03-05 function literal syntax
//    function literal is an anonymous function

// example for a literal function; is the same as the named method below
// a function literal creates an instance of this method which can be passed as parameter
// to a function or can be assigned to a variable
  (param1: Int, param2: Int) => if (param1 > param2) param1 else param2
  def namedMethod(param1: Int, param2: Int):Int = if (param1 > param2) param1 else param2


// 03-06 apply method
//    method which can be used as a "default" method of an object
//    can be called with the instance name only
case class ApplyExample() {
  def apply(param1: String): String = "test apply" + param1
}

val testApply = ApplyExample()
testApply("test")
