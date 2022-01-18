package com.jd.bigdata.scala.three

/**
 * Scala中的包声明方式默认和java是一致的。但是有其他的使用方式
 * 在同一个源码文件，可以多次声明,声明的类在最后的一个包中
 * 源码中的类不需要和包类路径相同
 * Scala中所有的语法都可以嵌套
 * package可以使用小括号，小括号内的类在这个包中，之外申明不在
 * scala中申明父包和子包，父包中的类，子类可以直接访问，不需要引入
 * scala中package里面可以声明类，但是无法声明变量和函数
 * scala中为了弥补包的不足，使用了包对象概念,包对象里面可以声明方法，变量
 */
package test{
  package object test{
    val s="abc"
  }
}

object ScalaPackage {

  def main(args: Array[String]): Unit = {
  }

}

