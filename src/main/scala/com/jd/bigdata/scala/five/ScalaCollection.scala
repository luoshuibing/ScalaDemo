package com.jd.bigdata.scala.five

/**
 * Scala中集合分为可变（mutable）和不可变（immutable）
 */
object ScalaCollection {

  def main(args: Array[String]): Unit = {
    //数组：Array,通过apply方法创建对象
    val ints: Array[Int] = Array(1, 2, 3, 4)
    //访问数组
    ints.foreach(println(_))
    //使用小括号访问数组
    println(ints(0))

  }

}
