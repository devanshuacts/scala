package com.cdac.scala

import java.util.Date

object partialApplied {
  
  def main(args: Array[String]){
    val logBound = log(new Date, _: String)
    logBound("message1")
    logBound("message2")
    logBound("message3")
  }
  
  def log(date: Date, message: String) = {
    println(date + "----------" + message)
  }
}