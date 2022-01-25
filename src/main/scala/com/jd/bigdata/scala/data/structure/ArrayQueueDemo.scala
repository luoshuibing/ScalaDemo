package com.jd.bigdata.scala.data.structure

import scala.io.StdIn

object ArrayQueueDemo {

  def main(args: Array[String]): Unit = {
    val queue = new ArrayQueue(3)
    var key = ""
    while (true) {
      println()
      println("请选择菜单")
      println("show:显示队列")
      println("add:添加数据")
      println("get:获取数据")
      println("peek:获取数据")
      println("exit:退出程序")
      key = StdIn.readLine()
      key match {
        case "show" => queue.show()
        case "add" =>
          println("请输入一个数")
          val num = StdIn.readInt()
          queue.addQueue(num)
        case "get" =>
          val res = queue.getQueue()
          if (res.isInstanceOf[Exception]) {
            println(res.asInstanceOf[Exception].getMessage)
          } else {
            println(res)
          }
        case "peek"=>
          val res = queue.peek()
          if (res.isInstanceOf[Exception]) {
            println(res.asInstanceOf[Exception].getMessage)
          } else {
            println(res)
          }
      }
    }
  }

}

class ArrayQueue(arrMaxSize: Int) {
  val maxSize = arrMaxSize
  val arr = new Array[Int](maxSize)
  var front = -1
  var rear = -1

  //判断队列是否满
  def isFull(): Boolean = {
    rear == maxSize - 1
  }

  //判断队列是否为空
  def isEmpty(): Boolean = {
    rear == front
  }

  //向队列中添加数据
  def addQueue(num: Int): Unit = {
    if (isFull()) {
      println("队列已经满，无法加入")
      return
    }
    //将rear后移,并且赋值
    rear += 1
    arr(rear) = num
  }

  def show(): Unit = {
    if (isEmpty()) {
      println("队列空")
      return
    }
    for (i <- front + 1 to rear) {
      println(arr(i))
    }
  }

  /**
   * 可能取到数据，可能取不到数据
   */
  def getQueue(): Any = {
    if (isEmpty()) {
      return new Exception("队列空，没有数据")
    }
    front += 1
    arr(front)
  }

  def peek(): Any = {
    if (isEmpty()) {
      return new Exception("队列空，没有数据")
    }
    arr(front + 1)
  }

}