package com.jd.bigdata.scala.two

import scala.collection.immutable
import scala.collection.immutable.Range
import scala.util.control.Breaks._

object Scala01_In {

  def main(args: Array[String]): Unit = {
    //    val line: String = StdIn.readLine()
    //    println(line)

    for (i <- 0 until 5) {
      println(i)
    }
    println(0.+(2))
    for (i <- Range(0, 5, 2)) {
      println(i)
    }
    val ints: immutable.IndexedSeq[Int] = for (i <- 0 to 5) yield i * 2
    println(ints)

    //trycatch
    breakable {
      for (i <- 0 to 5) {
        if (i == 5) {
          //通过抛异常
          break
        }
        println(i)
      }
    }
    println("完成")
    var i=0;
    while(i<5){
      println(i)
      i+=1
    }
    println("完成")
  }

}
