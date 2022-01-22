package com.jd.bigdata.scala.five

/**
 * Scala中集合分为可变（mutable）和不可变（immutable）
 */
object ScalaTuple {

  def main(args: Array[String]): Unit = {
    //将无关的数据当成一个Map来使用
    val tuple: (String, String, String) = ("zhangsan", "1111", "xxxxx")
    //元组中最多的个数是22个
    println(tuple._1)
    for (elem <- tuple.productIterator){
      println(elem)
    }

    //如果元组中元素个数为2，类似于Map
    val tuple1: (Int, String) = (1, "zhangsan")
    val tupleMap: Map[Int, String] = Map(tuple1)
    tupleMap.foreach(t=>println(t))
  }

}
