package com.jd.bigdata.scala.two

object Scala01_Var {

  //在方法外部申明的变量如果采用var关键字，等同于使用final修饰
  val sex: String = "男"

  def main(args: Array[String]): Unit = {
    //声明变量,var变量可以修改
    var num: Int = 0;
    var score: Double = 1.0;
    var gender: Double = 1.0;
    var name: String = "Scott"
    //Scala申明变量必须初始化，使用val声明变量的值无法修改
    val hobby: String = "ls"
    //scala为了让开发过程变得简单，可以将自动推断出来的内容省略
    val tel = "13120111000"
    println(tel)
    

  }
}
