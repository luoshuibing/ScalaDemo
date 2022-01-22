package com.jd.bigdata.scala.six

import scala.collection.immutable
import scala.collection.parallel.immutable.ParSeq

object Method3 {

  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4)
    //折叠，也可以对集合数据进行简化，获取最终的一条结果
    //fold方法可以传递2个部分的参数，第一个部分表示集合之外的数据
    //第二部分的参数表示数据进行的逻辑处理，foldLeft   foldRight
    println(list.fold(100)(_ + _))
    println(list.fold(100)(_ - _))
    //reverse ==> 4,3,2,1
    //foldLeft ==> (10-4)-3-2-1
    //foldRight ==> 1-(2-((3-(4-10))))
    println(list.foldRight(10)(_ - _))

    println(list.scanLeft(10)(_ + _))


    val result1: immutable.IndexedSeq[String] = (0 to 100).map { case _ => Thread.currentThread().getName }
    val result2: ParSeq[String] = (0 to 100).par.map { case _ => Thread.currentThread().getName }
    println(result1)
    println(result2)
  }

}
