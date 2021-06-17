package Lectures.part2oop

object Objects extends App {

  object Person{
    val N_EYES = 2
    def canFly: Boolean = false
  }

  class Person {

  }
//Companions
  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object is a singleton instance

  val mary = Person
  val jhon = Person

  println(mary  == jhon)

}
