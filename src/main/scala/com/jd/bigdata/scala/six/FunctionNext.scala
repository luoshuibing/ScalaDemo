package com.jd.bigdata.scala.six

object FunctionNext {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, "abc")
    //map方法不能使用偏函数,方式一
    println(list.collect(new PartialFunction[Any, Int] {
      def isDefinedAt(any: Any) = {
        if (any.isInstanceOf[Int]) true
        else false
      }

      def apply(any: Any) = any.asInstanceOf[Int] + 1
    }))
    //方式二
    println(list.collect({ case i: Int => i + 1 }))

    println(list.map {
      case num => num + "xxx"
    })

    println(list.sortWith({
      case (left, right) => {
        left.toString > right.toString
      }
    }))
  }

}
