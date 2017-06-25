package com.cdac.spark

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.sql._
import org.apache.log4j._

object BasicQuery{

case class Cars1(name: String)
  
// Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)
    
// Use new SparkSession interface in Spark 2.0
    val spark = SparkSession
      .builder
      .appName("BasicQuary")
      .master("local[*]")
      //.config("spark.sql.warehouse.dir", "file:///C:/temp") // Necessary to work around a Windows bug in Spark 2.0.0; omit if you're not on Windows.
      .getOrCreate()
 
      def main(args: Array[String]) {
         import spark.implicits._
 
          val lines = spark.sqlContext.sparkSession.read.json("/home/devanshu/Data_Analytics/Spark/Spark with Scala/files_for_programs/cars.json")
           
          lines.registerTempTable("Cars1")
           
          val result = spark.sql("SELECT * FROM cars1")
           
          result.show()
}
 
}
 
