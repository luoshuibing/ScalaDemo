package com.jd.bigdata.scala.four

object Clazz1 {

  def main(args: Array[String]): Unit = {
    val p: Parent = new Son("zhangsan")

  }

}

class Parent(s: String) {
  println("Person 主构造方法" + s)
}

//如果父类主构造方法有参数，name构建对象时必须显示的传递参数
//可以在继承的父类后面增加小括号，传递参数，等同于调用父类构造方法
class Son(s: String) extends Parent(s: String) {
  println("Son 主构造方法")

  def this() {
    this("zhangsan")
    println("User 辅助构造方法")
  }
}
