object Main {
  def main(args: Array[String]): Unit = {
    // Ejercicio 1
    val E1 = List('a', 'B', 'c')
    val Result = E1.map(element => List(element.toUpper, element.toLower))
    println("Ejercicio 1:")
    println(Result)

    // Ejercicio 2
    val E2 = List("Andres David", "Camilo", "Juan")
    val Result2 = E2.filter(name => name.length >= 6 && name.startsWith("A"))
    println("\nEjercicio 2:")
    println(Result2)

    // Ejercicio 3
    val E3 = List("a", "b", "e", "f")
    println("\nEjercicio 3:")
    E3.foreach(char => if (char.matches("[aeiouAEIOU]")) println(s"'$char'"))

    // Ejercicio 4
    val E4 = List(1, 2, 3, 4, 5, 6, 7)
    val Result4 = Solution(E4)
    println("\nEjercicio 4:")
    println(Result4)
  }

  def Solution(list: List[Int]): List[Int] = {
    list match {
      case Nil => Nil
      case x :: xs =>
        val transformed = if (x % 2 == 1) x * 2 else x
        val rest = Solution(xs)
        if (rest.contains(transformed)) rest else (transformed :: rest).sorted(Ordering[Int].reverse)
    }
  }
}
