package com.jd.bigdata.scala.six

import scala.collection.mutable

object Method4 {

  def main(args: Array[String]): Unit = {
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2: mutable.Map[String, Int] = mutable.Map("a" -> 3, "b" -> 4, "c" -> 5)
    //foldLeft和foldRight缩写分别是            /:和:\
    println(map1.foldLeft(map2)((map, t) => {
      map(t._1) = map.getOrElse(t._1, 0) + t._2
      map
    }))
  }

}
