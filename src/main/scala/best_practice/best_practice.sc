/**
  * BEST PRACTICES
  */

// methods with side effects should get the return type UNIT
def sideEffMethod() = println("Hello world")
sideEffMethod()