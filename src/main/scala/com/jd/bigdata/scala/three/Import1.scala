package com.jd.bigdata.scala.three

//scala中如果想要从最开始的包中查找类，需要增加绝对路径，使用_root_开头
import _root_.java.util._

//package java{
//  package util{
//
//    class HashMap{
//
//    }
//
//    object Import1 {
//      def main(args: Array[String]): Unit = {
////        val map=new HashMap
////        val map=new java.util.HashMap
//        val map=new _root_.java.util.HashMap()
//        println(map)
//      }
//    }
//  }
//}

object Import1 {
  def main(args: Array[String]): Unit = {
    //        val map=new HashMap
    //        val map=new java.util.HashMap
    val map=new _root_.java.util.HashMap()
    println(map)
  }
}

