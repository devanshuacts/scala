package com.cdac.practice

object exercise2 {
  def main(args: Array[String]){
    var str = "This is an experiment"
    var strArr = split(str)
    for(e <- strArr){
      println(e)
    }
    
   var manyStr = manyTimesString(str, 2)
    println(manyStr)
    
  }
  
  def split(s:String): Array[String]= {
    return s.split(" ") // works even if return is omitted 
  }
  
  def manyTimesString(s: String, n: Int): String = {
    var num = n
    var st = s
    while(num > 1){
      st = st.concat(s)
      num = num - 1
    }
    return st //or return s * n
  }
  
}