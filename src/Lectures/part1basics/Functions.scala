package Lectures.part1basics

object Functions extends App{

  def aFunction(a: String, b: Int): String =
    a + " " + b


  println(aFunction("hello",3))

  def aParameterLessFunction(): Int =42

  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String ={
    if(n==1) aString
    else aString + aRepeatedFunction(aString,n-1)
  }

  println(aRepeatedFunction("hello",3))

  def aBigFunction(n: Int): Int = {
  def aSmallerFunction(a: Int, b: Int): Int = a+b

    aSmallerFunction(n,n-1)
  }



  def aGreetingFunction(name: String, age: Int): Unit ={
    println(s"Hi, my name is ${name} and I am ${age} years old.")
  }

  aGreetingFunction("Shahar", 38)

  def FactorialFunction(n: Int): Int ={
    if(n <= 0) 1
    else n * FactorialFunction(n-1)
  }

  println(FactorialFunction(1))
  println(FactorialFunction(2))
  println(FactorialFunction(3))
  println(FactorialFunction(4))
  println(FactorialFunction(10))

  def aFibonacci(n: Int): Int = {
    if(n ==1 || n == 2) 1
    else aFibonacci(n-1) + aFibonacci(n-2)
  }

  println(aFibonacci(10))

  def isPrime(n: Int): Boolean = {


    def isPrimeUntil(divisor: Int): Boolean ={
      if(divisor <= 1) true
      else ((n % divisor) != 0) && isPrimeUntil(divisor -1)
    }

     isPrimeUntil(n/2)
  }

  println(isPrime(1))
  println(isPrime(2))
    println(isPrime(3))
    println(isPrime(4))
    println(isPrime(5))
    println(isPrime(6))
    println(isPrime(257))

}
