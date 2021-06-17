package Lectures.part1basics

object Expressions extends App{

  val x = 1+2
  var aVariable = 4
  println(x)

  println(2+3*4)
  println(1==x)

  //IF expressions

  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)
  println(if(aCondition) 5 else 3)

  var i =0
  while(i<10){
    println(i)
    i+=1
  }
  //NEVER write this again

  //EVERYTHING in Scala is an Expression!!!

  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  val aCodeBlock = {
    val y = 1
    val z = y + 2

    if(z>2)"hello" else "goodbye"
  }

  println(aCodeBlock)

}
