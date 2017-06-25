package com.cdac.scala
import scala.util.control._

object loop2 {
  
  def main(args: Array[String]) {
  val numList = List(1, 2, 3, 4 ,5)
    var a = 0
    var b = 0
    val outer = new Breaks;
    val inner = new Breaks;
    outer.breakable {
      for(a <- numList){
       println("Value of a : " + a)
       inner.breakable{
         for(b <- numList){
           println("Value of b : " + b)
           if(b == 4)
               inner.break;
         }
       }
       if(a == 3)
        outer.break;
      }
    }
  }
}