package com.cdac.scala

import java.io._

object fileIO {
  def main(args: Array[String]){
    val writer = new PrintWriter(new File("test.txt"))
    
    writer.write("Hello Scala")
    writer.close()
    
    //to implement below block of code, java io import needs to be commented
    /*print("please enter your input: ")
    val line = Console.readLine
    println("Thanks, you just typed: "+ line)*/
    //end of console readline
  }
}