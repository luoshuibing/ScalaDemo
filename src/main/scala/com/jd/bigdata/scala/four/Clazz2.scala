package com.jd.bigdata.scala.four

object Clazz2 {

  def main(args: Array[String]): Unit = {
    val w = new Water("zhangsan")
    println(w.name)
  }

}
// 类构造方法的参数的作用域默认为整个类的主体，但是如果想要参数作为属性来使用，可以采用特殊方式声明，var，val
class Water(var name: String) {

}
