package com.jd.bigdata.scala.one

object ScalaDemo02_Print {

  /**
   * Scala的3中打印方式
   * @param args
   */
  def main(args: Array[String]): Unit = {
    val name="zs"
    val age=20
    println("name="+name+",age="+age)
    printf("name=%s,age=%d\n",name,age)
    //插值字符串
    println(s"name=$name,age=$age")
    //格式化
    println(f"name=$name,age=$age%.2f")
    //原始
    println(raw"name=$name,age=$age%.2f")
  }

}
