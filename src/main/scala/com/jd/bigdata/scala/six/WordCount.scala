package com.jd.bigdata.scala.six

import scala.io.Source

/**
 * wordCount案例
 */
object WordCount {

  def main(args: Array[String]): Unit = {
    println(Source.fromFile("in/word.txt").getLines().toList.groupBy(x => x).map(t => {
      (t._1, t._2.size)
    }).toList.flatMap(t => {
      val strings: Array[String] = t._1.split(" ")
      strings.map(x => (x, t._2))
    }).groupBy(t => {
      t._1
    }).map(t => {
      (t._1, t._2.map(x => x._2).sum)
    }).toList.sortWith((x, y) => x._2 > y._2).take(3))

  }

}
