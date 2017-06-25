package com.cdac.scala

import scala.io.Source

object fileread {
  def main(args: Array[String]){
    println("Following is the content read: ")
    Source.fromFile("test.txt").foreach{
      print
    }
  }
}