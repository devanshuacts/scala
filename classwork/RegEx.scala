package com.cdac.scala

import scala.util.matching.Regex

object RegEx {
  def main(args: Array[String]){
    val pattern = "Scala".r //r is a method
    val str1 = "Scala is scalable and cool"
    println(pattern findFirstIn str1)
    
    val str2 = "Scala is Scalable and cool"
    val ret = pattern.findAllIn(str2)// or pattern findAllIn str
    println(ret)
    for(i <- ret)
      println(i)
    
    //Regex constructor
    val ptrn = new Regex("(S|s)cala")
    println(ptrn.findAllIn(str1).mkString(","))
    println(ptrn replaceFirstIn(str1, "Java"))
  }
}