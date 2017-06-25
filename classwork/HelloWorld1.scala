package com.cdac.scala

object HelloWorld1 {
  
  def main(args: Array[String]) {
    println("\nHello, World")
    println("My pleasure\tGood to get started")
    println("Scala is little confusing")
      
  }
  
  val numbers = List(1,2,3,4,5)
  
  var total = 0;
  for(e<- numbers){
    total += e
  }
  println("total with regular style\n"+total)
  
  println("With functional style")
  
  println(
    numbers.foldLeft(0){(c,e)=> c + e}    
  )
}