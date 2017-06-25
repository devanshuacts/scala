package com.cdac.spark


import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.sql._
import org.apache.log4j._
import scala.math.min

object PurchaseByCustomer {
  
  def parseLine(line:String)= {
    val fields = line.split(",")
    val customerID = fields(1)
    val purchaseAmount = fields(2).toFloat
    (customerID,purchaseAmount)
  }
  
   def main(args: Array[String]) {
     
    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)
    
     // Create a SparkContext using every core of the local machine
    val sc = new SparkContext("local[*]", "PurchaseByCustomer")
    
    // Read each line of input data
    val lines = sc.textFile("C:/SparkScala/customer-orders.csv")
    
    
    // Convert to (customerID,purchaseAmount) tuples
    val parsedLines = lines.map(parseLine)
    
    // Reduce by parsedLine Adding all the purchases by a customer
    val purchases = parsedLines.reduceByKey( (x,y) => x + y)
     
   }
  
  
  
}