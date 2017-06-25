package com.cdac.scala

object curryFunction {
  def main(args: Array[String]){
    var str1:String = "Hello, "
    var str2:String = "Scala"
    println("str1 + str2 = " + strcat(str1)(str2))
  }
  
  def strcat(s1: String)(s2:String) = {
    s1 + s2
  }
}