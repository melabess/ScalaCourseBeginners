package Lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{

  def Factorial(n: Int): Int ={
    if(n <= 0) 1
    else n * Factorial(n-1)
  }
def anotherFactorial (n: Int): Int ={
@tailrec
  def factHelper(x: Int, accumulator: Int): Int =
    if (x<=1) accumulator
    else factHelper(x-1,x*accumulator) //TAIL RECURSION = use recursion call as the last expression

  factHelper(n,1)
}


  def aRepeatedFunction(aString: String, n: Int): String ={
    @tailrec
    def repeatStringHelper(accumStr: String, counter: Int): String ={
      if(n==counter) accumStr
      else repeatStringHelper(accumStr + aString ,counter+ 1)
    }

    repeatStringHelper(aString,1)
  }
println(aRepeatedFunction("Test",5))

  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciHelper(counter: Int, last: Int, nextToLast: Int): Int = {
      if(counter>=n) last
     else  fibonacciHelper(counter +1, last+ nextToLast, last)

   }
    if (n == 1)0
    else if (n <=2)1
    else     fibonacciHelper(3, 1, 1)

  }

  println(fibonacci(1))
  println(fibonacci(2))
  println(fibonacci(3))
  println(fibonacci(4))
  println(fibonacci(5))
  println(fibonacci(6))
  println(fibonacci(7))
  println(fibonacci(8))
  println(fibonacci(9))
  println(fibonacci(10))


  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(divisor: Int , currentStatus: Boolean): Boolean ={
      if(!currentStatus) false
      else if(divisor <= 1) true
      else  isPrimeUntil(divisor -1,((n % divisor) != 0) && currentStatus)
    }

    isPrimeUntil(n/2,true)
  }

  println(isPrime(10))
  println(isPrime(2003))

}
