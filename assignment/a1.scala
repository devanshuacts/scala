package com.cdac.assignment
import scala.math._
//import scala.io.StdIn._

object a1 {
 
  def main(args: Array[String]) {
    //problem 1
//    val num1 = 100; var num2 = 200; var num3 = 52
//    val m1 = max(num1, num2)
//    val m2 = max(num2, num3)
//    val m3 = max(m1, m2)
//    println("max number is: ", m3)
//  
//    //problem 2
//    for(a <- 1 to 128){
//      println("a is "+a + " and ascii val is: "+a.toChar)
//    }
  
    //problem 3
//    val num = scala.io.StdIn.readInt()
//    if(num % 2 == 0)
//      println(num + "is even")
//    else
//      println(num + "is odd")
//    
//    //problem 4
//    val str = scala.io.StdIn.readLine()
//    println(str)
    
    //problem 5
    println("Enter English marks: ")
    val eng = scala.io.StdIn.readInt()
    println("Enter Maths marks: ")
    val math = scala.io.StdIn.readInt()
    println("Enter Linux marks: ")
    val linux = scala.io.StdIn.readInt()
    
    var tot = eng + math + linux
    var percentage = tot / 3
    if(percentage > 90)
      println("Grade A, kam padh")
    else if(percentage > 70)
      println("Grade B, aur padh sharmaji ka ladka Grade A laya")
    else
      println("Grade C. beta tumse na ho payega")      
      
  }
}