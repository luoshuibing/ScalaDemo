package com.jd.bigdata.scala.six

object Match1 {

  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        //条件守卫
        case _ if ch.toString.equals("3") => sign = 1
        case _ => sign = 2
      }
      println(ch + " " + sign + " " + digit)
    }
  }

}
