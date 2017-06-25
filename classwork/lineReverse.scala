package com.cdac.scala

import scala.io.Source
import java.io.PrintWriter

object lineReverse {
  def main(args: Array[String]){
    val out = new PrintWriter("01.out")
    val source = Source.fromFile("01.txt").
    getLines().toArray.reverse.foreach(out.println(_))
    out.close()
    
  }
}