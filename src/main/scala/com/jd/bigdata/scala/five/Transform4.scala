package com.jd.bigdata.scala.five

import com.jd.bigdata.scala.five.Transform4.Watermelon

object Transform4 {

  def main(args: Array[String]): Unit = {


    val tomato = new Watermelon()
    tomato.delete()

  }

  class Watermelon extends Banana {
    def save(): Unit = {
      println("保存")
    }
  }

}

trait Banana {

}

object Banana {

  implicit class PineApple(t: Watermelon) {
    def delete(): Unit = {
      println("删除")
    }
  }

}