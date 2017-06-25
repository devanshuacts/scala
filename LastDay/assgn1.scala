package com.cdac.scala

object assgn1 {
  def main(args: Array[String]){
    
    //read length of array from stdin
    val num = scala.io.StdIn.readInt()
    
    var arrRand = new Array[Int](num)
    
    for(i <- 0 until arrRand.length){
      val r = new scala.util.Random
      arrRand(i) = r.nextInt()
    }
    
    for(j <- 0 to arrRand.length - 1){
      println("arrRand("+j+")= "+arrRand(j))
    }
    
    println(arrRand.mkString(", "))
    
  }
}