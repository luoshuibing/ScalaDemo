package com.jd.bigdata.scala.six

object Match3 {

  def main(args: Array[String]): Unit = {
    for(arr<- Array(Array(0),Array(1,0),Array(0,1,0),Array(1,1,0),Array(1,1,0,1))){
      var result=arr match{
        case Array(0)=>"0"
        case Array(x,y)=>x+"="+y
        case Array(0,_*)=>"以0开头和数组"
        case _=>"什么集合都不是"
      }
      println(result)
    }
  }

}
