package com.jd.bigdata.scala.six

object Method2 {

  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4)
    //条数变少,reduceLeft和reduceRight
    println(list.reduce(_ + _))


  }

}
