package com.jd.bigdata.scala.four
//scala会自动导入scala包中的类
object ClassInfo1 extends App {

  println("zhangsan....")
  println(MyColor.RED)

}

object MyColor extends Enumeration {

  var RED=Value(1,"read")
  var YELLOW=Value(2,"yellow")

}
