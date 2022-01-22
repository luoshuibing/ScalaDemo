package com.jd.bigdata.scala.six

object Match7 {

  def main(args: Array[String]): Unit = {
    val (x,y)=(1,2)
    println(x)
    println(y)

    val (q,r)=BigInt(10)/%3
    println(q)
    println(r)
    val list = List(("a", 1), ("b", 2), ("c", 3))
    for ((k,v) <- list) {
      println(k)
      println(v)
    }
  }

}
