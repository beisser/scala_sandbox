/**
  * 07 ARRAYS
  */

// 07-01 array basics
//    creating an array with assigned values
  val array1: Array[String] = Array("one", "two", "three")

//    access array element
  val element1 = array1(0)

//    creating an array with no assigned values
  val array2: Array[String] = new Array[String](3)

//  assign a value to an element
  array2(1) = "two"


// 07-02 looping arrays
  for(i <- 0 to 2) println(array1(i))