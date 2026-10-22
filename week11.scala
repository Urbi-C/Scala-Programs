
import scala.collection.mutable

object HashMapOperations {

  // Function to merge two HashMaps, keeping the higher grade
  def mergeMaps(
      map1: mutable.HashMap[String, Int],
      map2: mutable.HashMap[String, Int]
  ): mutable.HashMap[String, Int] = {

    val merged = mutable.HashMap[String, Int]()

    merged ++= map1

    for ((name, grade) <- map2) {
      if (merged.contains(name)) {
        merged(name) = math.max(merged(name), grade)
      } else {
        merged(name) = grade
      }
    }

    merged
  }

  // Function to handle collisions using chaining
  def addWithChaining(
      hashTable: mutable.HashMap[String, List[Int]],
      key: String,
      value: Int
  ): Unit = {

    val existingValues = hashTable.getOrElse(key, List())
    hashTable(key) = existingValues :+ value
  }

  def main(args: Array[String]): Unit = {

    // 1. Create a HashMap and insert student grades
    val students = mutable.HashMap[String, Int]()

    students("Alice") = 85
    students("Bob") = 90
    students("Charlie") = 78
    students("Alice") = 95 // Duplicate key: updates Alice's grade

    println("Student HashMap: " + students)

    // 2. Create another HashMap
    val otherStudents = mutable.HashMap[String, Int](
      "Alice" -> 92,
      "David" -> 88,
      "Bob" -> 84
    )

    println("Second HashMap: " + otherStudents)

    // Merge maps, retaining the higher grade
    val merged = mergeMaps(students, otherStudents)
    println("Merged HashMap: " + merged)

    // 3. Demonstrate collision handling using chaining
    val hashTable = mutable.HashMap[String, List[Int]]()

    addWithChaining(hashTable, "Key1", 100)
    addWithChaining(hashTable, "Key1", 200)
    addWithChaining(hashTable, "Key1", 300)
    addWithChaining(hashTable, "Key2", 400)

    println("Hash table with chaining: " + hashTable)
  }
}
