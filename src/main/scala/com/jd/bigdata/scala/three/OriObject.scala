package com.jd.bigdata.scala.three

import scala.beans.BeanProperty

/**
 * scala是一个完全面向对象的语言
 */
object OriObject {

  def main(args: Array[String]): Unit = {
    val user: User = new User
    val str: String = user.+("abc")
    println(str)
    println(user)
    user.setAddress("xxx")
    user.getAddress
    user.userName="张三"
    user.age=20
    println(user.login())
  }

}

class User {
  //必须显示初始化,自动赋值
  var userName: String = _
  var age: Int = _

  @BeanProperty var address: String=_

  def login(): Boolean = {
    true
  }

}

















































