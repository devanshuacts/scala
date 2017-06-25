package com.cdac.spark

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.sql._
import org.apache.log4j._

object PurchaseByCustomerSQL {
  case class Customer(PID:Int, CID:Int, Amount:Float)
  
  def mapper(line:String): Customer = {
    val fields = line.split(',')  
    
    val customer:Customer = Customer(fields(0).toInt, fields(1).toInt, fields(2).toFloat)
    return customer
  }
  
  def main(args: Array[String]) {
    
    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)
    
    // Use new SparkSession interface in Spark 2.0
    val spark = SparkSession
      .builder
      .appName("SparkSQL")
      .master("local[*]")
      //.config("spark.sql.warehouse.dir", "file:///C:/temp") // Necessary to work around a Windows bug in Spark 2.0.0; omit if you're not on Windows.
      .getOrCreate()
      
    val lines = spark.sparkContext.textFile("/home/devanshu/Data_Analytics/Spark/Spark with Scala/files_for_programs/customer-orders.csv")
    val cust = lines.map(mapper)
    
    // Infer the schema, and register the DataSet as a table.
    import spark.implicits._
    val schemaCust = cust.toDS
    
    schemaCust.printSchema()
    
    schemaCust.createOrReplaceTempView("cust")
  
    val amountByCID = spark.sql("SELECT CID, sum(Amount) FROM cust group by CID order by CID")
    
    val results = amountByCID.collect()
    
    results.foreach(println)
    
    spark.stop()
        
  }    
        
        
}