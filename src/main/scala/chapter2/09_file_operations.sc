/**
  * 09 Working with files
  */

import scala.io.Source

// 09-01 Reading from a file
  for(line <- Source.fromFile("testFile.txt")) {
    println(line)
  }