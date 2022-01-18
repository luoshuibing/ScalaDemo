package com.jd.bigdata.scala.five

object Transform3 {

  def main(args: Array[String]): Unit = {


    val tomato = new Tomato()
    tomato.delete()

  }

  /**
   * 其所带的构造参数有且只能有一个
   * 隐式类必须被定义在类或伴生对象或包对象里，即隐式类不能是顶级的
   * 隐式类不能是case class
   * 作用域内不能有与之相同名称的标识符
   * @param t
   */
  implicit class Pitaya(t: Tomato) {
    def delete(): Unit = {
      println("删除")
    }
  }

  class Tomato {
    def save(): Unit = {
      println("保存")
    }
  }

}
