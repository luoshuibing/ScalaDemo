package com.jd.bigdata.scala.six

object Method5 {

  def main(args: Array[String]): Unit = {
    val list=List(1,List(2,3),List(4,5),6,List(7,8))
    println(list.flatMap(any => {
      if (any.isInstanceOf[List[Int]]) {
        any.asInstanceOf[List[Int]]
      } else {
        List(any)
      }
    }))
  }

}
