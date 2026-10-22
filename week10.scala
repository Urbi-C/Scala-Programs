
object CollectionOperations {

  // Function to return the square of each element in a list
  def squareElements(numbers: List[Int]): List[Int] = {
    numbers.map(n => n * n)
  }

  // Function to return the intersection of two sets
  def findIntersection(set1: Set[Char], set2: Set[Char]): Set[Char] = {
    set1.intersect(set2)
  }

  def main(args: Array[String]): Unit = {

    // 1. Create a list of the first five prime numbers
    val primes = List(2, 3, 5, 7, 11)
    println("Prime numbers: " + primes)

    val squares = squareElements(primes)
    println("Squares of prime numbers: " + squares)

    // 2. Create a set of unique characters from a string
    val text = "hello world"
    val charSet = text.toSet
    println("Unique characters: " + charSet)

    // Create another set and find the intersection
    val anotherSet = Set('h', 'e', 'a', 'b', 'o')
    val intersection = findIntersection(charSet, anotherSet)
    println("Intersection of sets: " + intersection)

    // 3. Create a tuple with an integer, string, and boolean
    val details = (101, "Scala", true)

    println("Tuple elements:")
    println("Integer: " + details._1)
    println("String: " + details._2)
    println("Boolean: " + details._3)
  }
}
