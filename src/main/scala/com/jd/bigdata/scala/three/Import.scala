package com.jd.bigdata.scala.three

//import java.util._
//import java.util.{Date,List,ArrayList}
//import java.sql.Date
//可以采用特殊的方式来隐藏指定的类
//import java.util.{Date=>_}
//import 导包
//scala可以在导入类的时候给类起别名
import _root_.java.util.{HashMap=>JavaHashMap}
/**
 * 用于导入类
 * 可以在任意的地方使用
 * 可以导入一个包中所有的类,采用下划线
 * 采用大括号进行包含处理
 */
object Import {

  def main(args: Array[String]): Unit = {
//    import java.util.Date
//    val date = new util.Date()
//    println(date)
    println(new JavaHashMap)
  }

}
