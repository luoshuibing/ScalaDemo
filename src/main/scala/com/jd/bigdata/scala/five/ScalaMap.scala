package com.jd.bigdata.scala.five

import scala.collection.mutable

/**
 * Scala中集合分为可变（mutable）和不可变（immutable）
 */
object ScalaMap {

  def main(args: Array[String]): Unit = {
    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map.mkString("|"))
    val map2: Map[String, Int] = map + ("d" -> 4)
    println(map2.mkString(","))
    println(map == map2)
    val map3: Map[String, Int] = map2 - ("b")
    println(map3.mkString("|"))
    val map4: Map[String, Int] = map2 - ("e")
    println(map4.mkString("|"))
    val map5: Map[String, Int] = map.updated("b", 20)
    println(map5.mkString("|"))
    println(map)
    val map6: Map[String, Int] = map + ("a" -> 10)
    println(map6)
    println(map.get("a"))
    println(map.get("a").get)
    //scala为了防止空指针，提供了一个特殊的类，Option，有两个特殊的对象：Some，None
    //scala提供了一个默认值的方法
    //println(map.get("f").get)
    println(map.get("f").getOrElse())
    for (elem <- map) {
      println(elem._1)
      println(elem._2)
    }
    map.foreach(t=>println(t))
    val mMap: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)


  }

}
