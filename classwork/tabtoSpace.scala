package com.cdac.scala

import scala.io.Source
import java.io.PrintWriter

object tabtoSpace {
  //var column = 2
  def main(args: Array[String]){
    val source = Source.fromFile("02.txt")
    val out = new PrintWriter("02.out")
  
    for(c <- source)c match{
      case '\t' => {
        out.print(" "*2)
        print(c)
      }
      case '\n' => {
        out.print(c)
        print(c)
      }
      case _ => {
        out.print(c)
        print(c)
      }
    }
    //read all words from 03.txt and print which are greater than 12 letters
    io.Source.fromFile("03.txt").mkString.split("""[\s"\.\)\()/]+""").
    filter(_.length > 12).distinct.foreach(println(_))
    
    source.close()
    out.close()
  }
}