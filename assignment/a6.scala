package com.cdac.assignment

object a6 {
  
  //problem 6
  def main(args: Array[String]){
    var arr = new Array[Int](10)
    for(i <- 0 until 10){
      arr(i) = i;
    }
    for(j <- 0 to arr.length - 1){
      println("arr("+j+")= "+arr(j))
    }
    
    //problem 7
    var arrRev = arr.reverse
    for(j <- 0 to arrRev.length - 1){
      println("arrRev("+j+")= "+arrRev(j))
    } //or
    
    for(j <- (arr.length - 1) to 0 by -1)
      println("arr("+j+")= "+arr(j))
      
    //problem 8 and 9
    var sumEven = 0; var sumOdd = 0;
    val aEven = arr filter(_%2 == 0)
    val aOdd = arr filter(_%2 != 0)
    for(j <- 0 to aEven.length - 1){
      sumEven += aEven(j)
    }
    println("sum of even nos = "+sumEven)
    
    for(j <- 0 to aOdd.length - 1){
      sumOdd += aOdd(j)
    }
    println("sum of odd nos = "+sumOdd)
    
    //problem 10
    var numPrint = scala.io.StdIn.readInt()
    for(j <- 0 to numPrint - 1)
      println("arr("+j+")= "+arr(j))
    
      //problem 11
    var avg = (sumEven + sumOdd).toFloat / arr.length
    println("average of array elements = :" + avg)
      
    
    
    
    
    
    
  }
}