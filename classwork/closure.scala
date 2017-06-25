package com.cdac.scala

object closure {
  def main(args: Array[String]){
    println( "multiplier(1) value = " + multiplier(1))
    println( "multiplier(1) value = " + multiplier(1))
    println( "mul(1) value = " + mul(5))
  }
  var factor = 3
  val multiplier = (i:Int) => 1 * factor
  
  def mul(a:Int) = {
    a * factor
  }
}