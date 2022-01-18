package com.jd.bigdata.scala.five

object Transform {

  def main(args: Array[String]): Unit = {
    /**
     * 自动转换
     * scala默认的情况下支持数值类型的自动转换
     * byte->short->int->long
     * scala默认的情况下支持多态语法中的类型自动转换
     * scala也允许开发人员自定义转换规则
     * 将两个无关的类型通过编程手段让它们可以自定转换
     * 自定义转换规则implicit
     * OCP
     * 在相同的作用域内不能含有相同类型的转换规则
     */
    implicit def transform(d:Double):Int={
      d.toInt
    }

    val i: Int = 5.0
    println(i)
  }

}
