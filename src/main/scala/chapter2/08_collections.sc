import scala.collection.immutable.{HashMap, HashSet}

/**
  * 08 COLLECTIONS
  *
  * all collections can be created as an empty collection with the "empty" method
  */


// 08-01 Lists
//    definition
//    lists are immutable
  val listOne = List(1, 2)
  val listTwo = List(3, 4)

// concat operator two lists creating a new list
  listOne ::: listTwo

// cons operator to create a new list
// IMPORTANT: methods ending with ":" are method of the right entity
  listOne :: listTwo
  // is equal to
  listTwo.::(listOne)

  // lists can be created more efficient with cons
  // Nil is always the last list element and is required because of right associative cons operator
  val effList = 1 :: 2 :: 3 :: Nil

  // compare two list contents
  listOne == listTwo

  // convert lists to arrays and back
  val listToArray = listOne.toArray
  val arrayToList = listToArray.toList


// 08-02 Tuple
//    difference to lists: different types can be added
  val firstTuple = (1, "two", true)

  // access tuple elements
  // IMPORTANT: index does not start with 0
  val secondElement = firstTuple._2

  // extract all values from a tuple
  val (a, b, c) = firstTuple

  // extract a subset of values from a tuple
  val (d, e, _) = firstTuple


// 08-03 Sets
//    there immutable AND mutable versions
//    sets do not have duplicates
//    Set is the trait
  Set(1,2,3)

// HashSet is the actual implementation
  val hashSetVal = HashSet(1, 2, 3)


// 08-04 Maps
//    there immutable AND mutable versions
//    Map is the trait
  val map1 = Map("key" -> "value")
  // or
  val map2 = Map(("key", "value"))

  // fetch a value by key
  map1("key")

//    HashMap is the implementation
  val hashMapExample = HashMap("key" -> "value")

