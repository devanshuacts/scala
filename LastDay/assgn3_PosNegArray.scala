package com.cdac.scala

import scala.collection.mutable.ArrayBuffer

object assgn3_PosNegArray {
  def main(args: Array[String]){
    
    var myArr = Array(-1, -22, 3, -4, 35, 68, 786, 0, -471)
    var posArr = ArrayBuffer()
    var j = 0
    /*for(i <- 0 until myArr.length){
      if(myArr(i) > 0){
        posArr(j)+=myArr(i)
        j = j+1
      }
    }*/
    
  }
  
  def rearrange(a: Array[Int]) = {
    val s = new ArrayBuffer[Int]()
    for(i <- a if i > 0) s += i
    for(i <- a if i == 0) s+= i
    for(i <- a if i < 0) s += i
    s.toArray
  }
  
  println(rearrange(Array(1, -1, 2, -3, 0, 6, -9, 0)).mkString(", "))
}

