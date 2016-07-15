package com.example.learnspark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object Basics {
  
 def main(args: Array[String]): Unit = {
   
   println("I am ready to learn spark")
   
   val conf=new SparkConf().setAppName("First spark App").setMaster("local[*]")
   val sc=new SparkContext(conf)
   val myData=sc.textFile("data/test.dat")
   println(myData.count())
   
   
   
   
   
   
 }
  
  
}