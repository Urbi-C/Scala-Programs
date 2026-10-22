object ListOperations {

  def main(args: Array[String]): Unit = {

    // 1. Create a list of integers from 1 to 10
    val numbers = (1 to 10).toList
    println("Original List: " + numbers)

    // 2. Filter to get only even numbers
    val evenNumbers = numbers.filter(n => n % 2 == 0)
    println("Even Numbers: " + evenNumbers)

    // 3. Multiply each element by 3 using map
    val multiplied = numbers.map(n => n * 3)
    println("Elements Multiplied by 3: " + multiplied)

    // 4. Use flatMap to create tuples of numbers and their squares
    val tuples = numbers.flatMap(n => List((n, n * n)))
    println("Number and Square Tuples: " + tuples)

    // 5. Calculate the product of all elements using foldLeft
    val product = numbers.foldLeft(1)((acc, n) => acc * n)
    println("Product of All Elements: " + product)
  }
}