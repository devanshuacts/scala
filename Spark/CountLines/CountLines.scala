package com.cdac.spark

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

object CountLines {
  
  def main(args: Array[String]){
    Logger.getLogger("org").setLevel(Level.ERROR)
    val sc = new SparkContext("local[*]", "CountLines")
    val lines = sc.textFile("rfc7231.txt")
    val count = lines.count()
    println(count)
  }
}