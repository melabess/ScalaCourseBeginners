package Lectures.part2oop

import org.w3c.dom.css.Counter

object OOBasics extends App{

  val person = new Person("Shahar", 38)
  println(person.age)

  person.greet("Daniel")
  person.greet()


  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations",1861, author )

  println(author.yearOfBirth)
  println(novel.isWrittenBy(author))
  var counter = new Counter(10)

  counter.decrement
  counter.decrement(5)


}


class Person(name: String, val age: Int){



  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  def greet():Unit= println(s"Hi, I am $name")

  def this(name: String) = this(name,0)

}


class Writer(firstName: String, surname: String,val yearOfBirth: Int){

  def fullName(): String = s"$firstName $surname"
}

class Novel(name: String, yearOfRelease:Int, author: Writer){
  def authorAge():Int = yearOfRelease - author.yearOfBirth

  def isWrittenBy(author:Writer):Boolean = author == this.author
  def copy(yearOfCopyRelease: Int):Novel = new Novel(name,yearOfCopyRelease,author)

}

class Counter(count:Int){


  def decrement =
    {
      println("Decrementing")
      new Counter(count-1)
    }
  def decrement(value: Int):Counter = {
    if(value<=0) this
    else decrement(value-1)

  }
  def increment(value: Int):Counter =
    {
      if(value<=0) this
      else increment(value-1)
    }
  def increment  = new Counter(count+1)


}