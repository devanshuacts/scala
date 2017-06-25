package com.cdac.scala

object Match {
  def main(args: Array[String]) {
      println(matchTest(3))
      println(matchTest1("two"))
      println(matchTest1("test"))
      println(matchTest1(1))
   }
   
   def matchTest(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
   }
   
   def matchTest1(x: Any): Any = x match {
      case 1 => "one"
      case "two" => 2
      case y: Int => "scala.Int"
      case _ => "many"
   }
}