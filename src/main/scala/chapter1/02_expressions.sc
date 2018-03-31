/**
  *  02 EXPRESSIONS
  *
  *  expressions return values which can be assigned e.g to a value
  */

val args:Array[String] = Array("one", "two", "three")

// 02-01 if-expression
//    the if expression returns a value and can therefore be assigned
val ifResult: Int = if(true) { 1 } else { 2 }


// 02-02 for-expression
for(singleArg: String <- args) println(singleArg)


// 05-03 foreach
//    read more in
args.foreach(arg => println(arg))