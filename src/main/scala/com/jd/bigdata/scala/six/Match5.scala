package com.jd.bigdata.scala.six

object Match5 {

  def main(args: Array[String]): Unit = {
    for (pair <- Array((0, 1), (1, 0), (2, 1), (1, 0, 2))) {
      val result = pair match {
        case (0, _) => "0 ..."
        case (y, 0) => y
        case (a, b) => (b, a)
        case _ => "other"
      }
      println(result)
    }
  }

}
