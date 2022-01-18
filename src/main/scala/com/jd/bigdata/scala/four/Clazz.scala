package com.jd.bigdata.scala.four

object Clazz {

  def main(args: Array[String]): Unit = {
    val  dog=new Dog
    println(dog.test1)
  }

}

/**
 * 声明类
 * 父类，继承
 * 类可以声明为抽象的abstract
 */
abstract class Animal{
  //scala中属性也可以重写，因为属性可以抽象
  //属性只有声明，而没有初始化，那么就是抽象属性
  //抽象属性在编译为class文件时，不产生属性，但是产生抽象getter方法
  val age:Int
  var name:String=_
  def test()
  def test1():Unit={
    println("Parent Unit")
  }
}
class Dog extends Animal {
  //重写抽象属性,属性可以被覆盖，但是不能重写父类var声明的变量
  override val age:Int=11
  override def test(): Unit = {
    println("dog")
  }
  //scala如果子类重写父类的方法，需要增加override关键字
  override def test1():Unit={
    println("Parent Unit")
  }
}
