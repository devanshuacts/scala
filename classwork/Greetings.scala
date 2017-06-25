package com.cdac.scala

import scala.math._

object Greetings {
  
  def main(args: Array[String]){
    println("Greetings Planet Earth");
    
    val m1 = max(10, 20)
    val m2 = max(10, 4)
    println("inside main", m1, m2);
    
  }
  
  val m1 = max(100, 200);
  val m2 = max(100, 40);
  println("outside main", m1, m2);
  
  def max(x: Int, y: Int) = {
    if (x > y) x
    else y
  
  }
  
}