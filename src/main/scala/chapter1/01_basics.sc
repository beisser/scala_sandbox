/**
  *  01 SCALA BASICS
  */

// 01-01 print to stdout
println("Hello world")


// 01-02 nested scopes
//    value names can be used multiple times by nesting scopes (with {})
val sameName:String = "one"
val nestedScope: String = {
  val sameName: String = "two"
  sameName
}


// 01-03 values
//    assigned value can not be changed after initialized
val testVal: Int = 1


// 01-04 variables
//    assigned value can be changed after initialized
var testVar: Int = 2
testVar = 3









