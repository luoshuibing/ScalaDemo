package com.jd.bigdata.scala.three

//伴生类（成员）
class Student {
  private val sname = "zhangsan"
}

//伴生对象（静态）
//伴生对象可以访问伴生类的私有属性
//创建伴生类对象
//单例模式
object Student {

  def apply(): Student = new Student()
  def apply(s:String): Student = new Student()

  def test(): Unit = {
  }
}
