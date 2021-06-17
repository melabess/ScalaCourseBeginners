package Lectures.part2oop

object methodNotations extends App {

  class Person(val name: String, favouriteMovie: String,val age: Int = 0){
    def likes(movie: String): Boolean = movie == favouriteMovie
    def +(person: Person): String= s"${this.name} is hanging out with ${person.name}"
    def +(nickName: String): Person= new Person(s"$name (${nickName})",favouriteMovie)
    def unary_+ : Person= new Person(name,favouriteMovie, age+1)
    def learns(subject: String): String = s"$name learns $subject"
    def learnsScala(): String = this learns "scala"
    def unary_! : String = s"$name, what the heck?!"
    def isAlive : Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
    def apply(times: Int): String = s"$name watched $favouriteMovie $times times"
  }

  val mary = new Person("Mary", "Inception")




  print(mary.likes("Inception"))
  println(mary likes "Inception")

  // "operators in Scala

  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  println(1+2)
  println(1.+(2))

  //ALL OPERATORS ARE METHODS

  //prefix notation
  val x = -1
  val y = 1.unary_-
  //unary_prefix only works with - + ! ~

  println(!mary)
  println(mary.unary_!)

  // postfix notation

  println(mary.isAlive)
 // println(mary isAlive)

  //Apply
  println(mary.apply())
  println(mary())

  println((mary + "the rockstar").name)
  println(mary.age)
  println((+mary).age)
  //println(mary learnsScala())
  println(mary(2))
}
