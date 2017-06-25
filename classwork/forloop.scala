package com.cdac.scala
import scala.util.control._

object forloop {
  
  def main(args: Array[String]){
    val a = 0 //val ??
    for(a <- 1 to 10) {//<- is a generator as it generates individual values in range
     println("Value of a: " + a) 
    }
    println(a)
    for(a <- 1 until 10) {// until prints till 9 and exits at 10
     println("Value of a: " + a) 
    }
    
    for(a <- 1 to 3; b <- 1 to 4){
      println("Value of a: " + a)
      println("Value of b: " + b)
    }
    
    val numList = List(1, 2, 3, 4 ,5 ,6, 7, 8, 9, 10)
    var x = 0;
    val loop = new Breaks;
    loop.breakable {
      for(x <- numList
        if x != 2; if x != 5){
          println("Value of x : " + x)
          if(x == 8)
              loop.break;
      }
    }
    println("execution after loop")
  }
}