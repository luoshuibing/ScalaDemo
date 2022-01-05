package com.jd.bigdata.scala.one

object ScalaDemo01_Hello {

  /**
   * Scala是完全面向对象的语言，没有静态的语法，所以会生成两个class文件，只能通过模拟生成静态方法
   * 一般情况下将加$的类对象，称之为伴生对象，伴生对象中的内容都可以通过类名访问
   * 伴生对象的语法规则是使用object声明
   * scala中没有public关键字，默认所有的访问权限都是公共的
   * scala中没有void关键字，采用特殊的关键字Unit来模仿
   * scala中声明方法采用关键字def
   * scala中参数名：类型，java中类型 参数名
   * @param args
   */
  def main(args: Array[String]): Unit = {
    print("hello world")
    ScalaDemo01_Hello.test()
  }

  def test(): Unit = {}

}
