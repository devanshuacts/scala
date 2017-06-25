package com.cdac.practice

object evenOdd {
  
  def main(args: Array[String]){
    var arr = Array(10, 56, 9, 23, 74, 102, 77)
    var evenArr = arr.filter(_%2 == 0)
    var oddArr = arr filter(_%2 != 0)
    println("even array is: "+evenArr.mkString(", "))
    println("odd elements of the array are: ")
    for(e <- oddArr){
      println(e)
    }
  }
}