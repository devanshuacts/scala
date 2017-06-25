package com.cdac.scala

object assg4_ComputeAvg {
  
  def main(args: Array[String]){
    val arr = Array(2.5, 1.0, -6.99, 77)
    val avg = arr.sum/arr.length
    
    //compute average and print it
    println("average = "+avg)
    
    //reverse and print it
    println(arr.reverse.mkString(", "))
    
    //Convert to array Buffer
    val brr = arr.toBuffer
    println(brr.reverse.mkString(", "))
  }
}