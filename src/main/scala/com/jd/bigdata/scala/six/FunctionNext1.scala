package com.jd.bigdata.scala.six

object FunctionNext1 {

  def main(args: Array[String]): Unit = {
    //控制抽象，没有输入值没有输出值
    def test(f: => Unit): Unit = {
      f
    }

    test {
      println("xxxxxxxxxxxx")
    }
  }

}
