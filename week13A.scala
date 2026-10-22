
case class Person(name: String, age: Int, city: String)

object PersonOperations {

  // Function to filter people older than 30
  def filterOlderThan30(people: List[Person]): List[Person] = {
    people.filter(person => person.age > 30)
  }

  // Function to group people by city
  def groupByCity(people: List[Person]): Map[String, List[Person]] = {
    people.groupBy(_.city)
  }

  // Function to transform each Person into a formatted string
  def personToString(people: List[Person]): List[String] = {
    people.map(person =>
      s"${person.name} is ${person.age} years old and lives in ${person.city}"
    )
  }

  // Function to sort people by age in ascending order
  def sortByAge(people: List[Person]): List[Person] = {
    people.sortBy(_.age)
  }

  def main(args: Array[String]): Unit = {

    // Create a list of five Person objects
    val people = List(
      Person("Alice", 25, "Kolkata"),
      Person("Bob", 35, "Delhi"),
      Person("Charlie", 28, "Mumbai"),
      Person("David", 42, "Kolkata"),
      Person("Emma", 31, "Delhi")
    )

    println("Original List of People:")
    people.foreach(println)

    // Filter people older than 30
    println("\nPeople Older Than 30:")
    filterOlderThan30(people).foreach(println)

    // Group people by city
    println("\nPeople Grouped by City:")
    groupByCity(people).foreach { case (city, persons) =>
      println(city + " -> " + persons.map(_.name).mkString(", "))
    }

    // Transform Person objects into strings
    println("\nPerson Details:")
    personToString(people).foreach(println)

    // Sort people by age
    println("\nPeople Sorted by Age (Ascending):")
    sortByAge(people).foreach(println)
  }
}
