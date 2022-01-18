package com.jd.bigdata.scala.five

object Transform2 {

  def main(args: Array[String]): Unit = {
    implicit  val userName:String="wangwu"
    def test(implicit name:String="zhangsan"):Unit={
      println("Hello "+name)
    }

    test("张三")
    test()//方法调用时，使用小括号会导致隐式值无法传递
    test//方法调用时，不适用小括号可以传递隐式值
  }

}
