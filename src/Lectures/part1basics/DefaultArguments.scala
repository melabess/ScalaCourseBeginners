package Lectures.part1basics

object DefaultArguments extends App{

  def trFact(n: Int, acc: Int = 1): Int=
    if (n<=1) acc
    else trFact(n-1,n*acc)

println(trFact(1))
println(trFact(2))
println(trFact(3))
println(trFact(4))
println(trFact(5))

  def savePicture(format: String = "jpg", width: Int =1200, height: Int = 1000):Unit=println("Saving picture")

  savePicture(width =1090)
}
