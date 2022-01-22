package com.jd.bigdata.scala.five

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * Scala中集合分为可变（mutable）和不可变（immutable）
 */
object ScalaCollection {

  def main(args: Array[String]): Unit = {
    val separator: String = "===================================="
    //数组：Array,通过apply方法创建对象
    val ints: Array[Int] = Array(1, 2, 3, 4)
    //访问数组
    ints.foreach(println(_))
    //使用小括号访问数组
    println(ints(0))
    //打印数组的长度
    println(ints.length)
    //字符串拼接
    println(ints.+("abcd"))
    //将数组转换成字符串
    println(ints.mkString("|"))
    //数组遍历
    for (elem <- ints) {
      println(elem)
    }
    ints.foreach(i => println(i))
    ints.foreach(println)
    //增加元素
    ints.update(1, 10)
    ints.foreach(println)
    //添加元素
    val ints1: Array[Int] = ints :+ (50)
    val ints2: Array[Int] = 100 +: ints
    ints2.foreach(println)
    ints1.foreach(println)
    println(separator)
    val strings: ArrayBuffer[String] = ArrayBuffer("a", "b", "c", "d")
    //查询值
    println(strings(0))
    //修改值
    strings.update(0, "e")
    println(strings.mkString("|"))
    strings.foreach(println)
    strings.insert(4, "f")
    val strings1: ArrayBuffer[String] = strings += ("g")
    println(strings == strings1)
    strings -= "a"
    val str: String = strings.remove(1)
    val unit: Unit = strings.remove(1, 2)
    strings.foreach(println)
    println(separator)
    //可变不可变转化
    val buffer: mutable.Buffer[Int] = ints1.toBuffer
    val array: Array[String] = strings.toArray
  }

}
