/**
  * BEST PRACTICES
  */

// in general
//    prefer vals, immutable objects and methods with NO side effects meaning methods not
//    returning Unit
//    BUT vars, mutable objects and methods with side effects can be better for performance (so
//    they might be better if performance matters)

      val args = Array("one", "two")

      // wrong way
      def printArgs(args: Array[String]) = {
        for(arg <- args)
          println(arg)
      }
      printArgs(args)

      // functional way because method returns an result which can be tested
      def printArgs2(args: Array[String]): String = args.mkString("\n")
      printArgs2(args)

// methods with side effects should get the return type UNIT
def sideEffMethod() = println("Hello world")
sideEffMethod()