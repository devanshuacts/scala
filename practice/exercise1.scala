package com.cdac.practice

import scala.util.control.Breaks

object exercise1 {
  def main(args: Array[String]){
    //var a = 0;
    var myArr = Array(3,51,24,74,3,36,76,3,51,51,3)
    /*var ret = for{a <- myArr if a != 24} yield a
    for(x <- ret)
      println(x)*/
      
    val grouped = myArr.groupBy(i => i)
    val mapped = grouped.mapValues(_.size).maxBy(_._2)
    println(mapped)
    
    val sqd = myArr.map(i => i*i)

    println(sqd.mkString(", "))
    for(e <- sqd) println(e)
    
    println(myArr.reverse.mkString(", "))
    
    val strArr = Array("hello", "this", "is",  "scala")
    for(s <- strArr){
      println(s.reverse.mkString(", "))
    }
    println(strArr.reverse.mkString(", "))
    
    val str = scala.io.StdIn.readLine()
    val loop = new Breaks
    var flag = false
    loop.breakable{
      for(e <- strArr){
        if (e.equals(str)){
          flag = true
          loop.break()
        }
      }
    }
    if(flag == true) println("found")
    else println("bad luck")
  }
}