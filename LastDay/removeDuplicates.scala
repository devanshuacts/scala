package com.cdac.scala

object removeDuplicates {
  
  def main(args: Array[String]){
    val arrDup = Array(1, 7, 9, 0, 4, 7, 18, 1, 3)
    
    //for(i <- 0 until arrDup.length)
    println(arrDup.distinct.mkString(", "))
  }
}