package com.cdac.scala

import java.util.TimeZone

object TimeZones {
  
  def main(args: Array[String]){
    
  }
  
  val timeZones = (for {
    id <- TimeZone.getAvailableIDs
    if !id.startsWith("America/")
  } yield id).sorted
  
  println(timeZones.mkString("\n"))
  
}