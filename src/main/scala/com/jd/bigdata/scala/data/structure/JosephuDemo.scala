package com.jd.bigdata.scala.data.structure

import scala.util.control.Breaks._

object JosephuDemo {

  def main(args: Array[String]): Unit = {
    val josephu = new Josephu
    josephu.addBoy(140000000)
    josephu.list()
    //josephu.count(1, 3, 500)
    josephu.countNoFirst(2,3,140000000)
  }

}

class Josephu {
  var first: Boy = null

  def count(startNo: Int, countNum: Int, boyNums: Int): Unit = {
    if (isEmpty() || startNo > boyNums || startNo <= 0) {
      println("前置条件有误")
    }
    var helper: Boy = first
    breakable {
      while (true) {
        if (helper.next == first) {
          break()
        }
        helper = helper.next
      }
    }

    for (i <- 0 until (startNo - 1)) {
      println(i)
      first = first.next
      helper = helper.next
    }

    breakable {
      while (true) {
        for (i <- 0 until countNum - 1) {
          first = first.next
          helper = helper.next
        }

        println(s"${first.no}出圈")
        first = first.next
        helper.next = first
        if (first == helper) {
          break()
        }
      }
    }
    println(s"${first.no}你活下来了")


  }

  def addBoy(boyNums: Int): Unit = {
    var curBoy: Boy = null
    for (i <- 1 to boyNums) {
      val boy = new Boy(i)
      if (i == 1) {
        first = boy
        curBoy = boy
        first.next = first
      } else {
        curBoy.next = boy
        boy.next = first
        curBoy = boy
      }
    }
  }

  def isEmpty(): Boolean = {
    first == null
  }

  def list(): Unit = {
    if (isEmpty()) {
      println("环形链表为空")
      return
    }
    var temp: Boy = first
    breakable {
      while (true) {
        println(s"${temp.no}")
        if (temp.next == first) {
          break()
        } else {
          temp = temp.next
        }
      }
    }
  }

  /**
   * 使用前置指针
   * @param startNo
   * @param countNum
   * @param boyNums
   */
  def countNoFirst(startNo: Int, countNum: Int, boyNums: Int): Unit = {
    if (isEmpty() || startNo > boyNums || startNo <= 0) {
      println("前置条件有误")
    }
    var helper: Boy = first
    breakable {
      while (true) {
        if (helper.next == first) {
          break()
        }
        helper = helper.next
      }
    }

    for (i <- 0 until (startNo - 1)) {
      helper = helper.next
    }

    breakable {
      while (true) {
        for (i <- 0 until countNum - 1) {
          helper = helper.next
        }

        println(s"${helper.next.no}出圈")
        helper.next = helper.next.next
        if (helper.next == helper) {
          break()
        }
      }
    }
    println(s"${helper.next.no}你活下来了")


  }
}

class Boy(i: Int) {
  var no: Int = i
  var next: Boy = null
}

