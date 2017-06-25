package com.cdac.scala

object assgn2_Swap_Adjacent {
  
  def main(args: Array[String]){
    
    var myArr = Array(1, 2, 3, 4, 5, 6)
    
    for(i <- 0 until (myArr.length - 1, 2)){
      val temp = myArr(i)
      myArr(i) = myArr(i + 1)
      myArr(i + 1) = temp
    }
    
    println(myArr.mkString(", "))
    
  }
}