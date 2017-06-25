package com.cdac.scala

object ControlStmts1 {
  
  def main(args: Array[String]){
    var x = 30;var y = 10;
    if(x == 10){
      println("Value of x is 10")
    }
    else if(x == 20){
      println("Value of x is 20")
    }
    else if(x == 30){
      if(y == 10){
        println("Value of x is 30 and y is 10")
      }
    }
    else{
      println("This is else statement")
    }
    
    do{
      println("value of a: " + y)
      y = y + 1
    }while(y < 20);
  }
}