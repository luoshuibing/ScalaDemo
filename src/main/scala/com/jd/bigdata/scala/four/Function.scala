package com.jd.bigdata.scala.four

object Function {

  def main(args: Array[String]): Unit = {
    val person = new Person()
    println(person)
  }


}

// scala的构造方法分为两类：主构造方法&辅助构造方法
// scala的构件对象可以通过辅助构造方法创建，但是必须调用主构造方法
// scala是完全面向函数的语言，所以类也是函数
// 类是函数，可以使用小括号作为函数的参数列表
// 类所代表的函数其实就是这个类的构造方法
// 默认情况下，scala也是给类提供无参构造方法，所以小括号可以省略
// 在类的后面声明的构造方法就是主构造方法
// 在主构造方法中声明的构造方法就是辅助构造方法
// 如果想让主构造器变成私有的，可以在（）之前加上private，这样用户不能直接通过主构造器来构造对象
//class Person private (s: String) {
class Person(s: String) {
  println("主构造方法")
  println(s)

  def this(s:String,ss:String) {
    this(s)
    println("辅助构造方法2")
  }

  def this(){
    this("辅助构造方法1","xxxx")
  }

}