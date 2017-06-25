package com.cdac.spark

import org.apache.spark._
import org.apache.spark.SparkContext
import org.apache.log4j._

object CountLinesbyFlatMap {
  
  def main(args: Array[String]){
    Logger.getLogger("org").setLevel(Level.ERROR)
    
    val sc = new SparkContext("local[*]", "CountLinesbyFlatMap")
    
    val input = sc.textFile("/home/devanshu/Data_Analytics/Spark/Spark with Scala/files_for_programs/book.txt")
    
    //val words = input.flatMap(x => x.split(" "))
    val words = input.flatMap(x => x.split("\\W"))
    
    val lowerCaseWords = words.map(x => x.toLowerCase())
    
    val wordCounts = lowerCaseWords.countByValue()   
    
    wordCounts.foreach(println)
  }
}