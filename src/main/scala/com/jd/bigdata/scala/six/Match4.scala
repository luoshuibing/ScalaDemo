package com.jd.bigdata.scala.six

object Match4 {

  def main(args: Array[String]): Unit = {
    for(list<- Array(List(0),List(1,0),List(0,0,0),List(1,0,0))){
      var result=list match{
        case 0::Nil=>"0"
        case x::y::Nil=>x+" "+y
        case 0::tail=>"0 ..."
        case _=>"something else"
      }
      println(result)
    }
  }

}
