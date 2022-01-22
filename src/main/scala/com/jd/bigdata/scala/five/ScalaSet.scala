package com.jd.bigdata.scala.five

import scala.collection.mutable


/**
 * Scala中集合分为可变（mutable）和不可变（immutable）
 */
object ScalaSet {

  def main(args: Array[String]): Unit = {
    //Set集合：无序，不可重复
    //默认scala提供的set集合就是不可变的
    val set = Set(1, 2, 3, 4, 1,9,1,3,1)
    println(set + 13)
    println(set)
    println(set-13)
    println(set.mkString("|"))
    for (elem <- set) {
      println(elem)
    }
    val mSet: mutable.Set[Int] = mutable.Set(1, 2, 3, 4)

  }

}
