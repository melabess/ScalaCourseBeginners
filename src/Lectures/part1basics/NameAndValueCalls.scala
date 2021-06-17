package Lectures.part1basics

object NameAndValueCalls extends  App {


  def callByValue(x: Long): Unit={
    println(s"Call by Value : ${x}")
    println(s"Call by Value : ${x}")
  }


  def callByName(x: => Long): Unit={
    println(s"Call by Name : ${x}")
    println(s"Call by Name : ${x}")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)




}
