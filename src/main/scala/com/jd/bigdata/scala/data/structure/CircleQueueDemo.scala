package com.jd.bigdata.scala.data.structure

import scala.io.StdIn

/**
 * Scala版本的环形队列
 */
object CircleQueueDemo {

  def main(args: Array[String]): Unit = {
    val queue = new CircleQueue(4)
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
        case "peek" =>
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

class CircleQueue(arrMaxSize: Int) {
  val maxSize = arrMaxSize
  val arr = new Array[Int](maxSize)
  //front 初始化为0，表示队列的头，指向队列的第一个元素
  var front = 0
  //rear 初始化为0，指向队列最后这个元素的后一个位置
  var rear = 0

  def isEmpty(): Boolean = {
    rear == front
  }

  def isFull(): Boolean = {
    (rear + 1) % maxSize == front
  }

  def addQueue(num: Int): Unit = {
    if (isFull()) {
      println("队列满，不能加入")
      return
    }
    arr(rear) = num
    rear = (rear + 1) % maxSize
  }

  def getQueue(): Any = {
    if (isEmpty()) {
      return new Exception("队列空，没有数据")
    }
    val res = arr(front)
    front = (front + 1) % maxSize
    res
  }

  def show(): Unit = {
    if (isEmpty()) {
      println("队列为空")
      return
    }

    for (i <- front until front + size()) {
      println(arr(i % maxSize))
    }

  }

  def size(): Int = {
    (rear + maxSize - front) % maxSize
  }

  def peek(): Any = {
    if (isEmpty()) {
      new Exception("队列空，无数据")
    }

    arr(front)

  }


}
