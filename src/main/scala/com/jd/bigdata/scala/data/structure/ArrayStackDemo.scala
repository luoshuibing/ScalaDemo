package com.jd.bigdata.scala.data.structure

import scala.io.StdIn

object ArrayStackDemo {

  def main(args: Array[String]): Unit = {
    val stack = new ArrayStack(4)
    var key = ""
    while (true) {
      println()
      println("push:入栈操作")
      println("list:遍历")
      println("pop:出栈")
      println("peek:查看栈顶")
      key = StdIn.readLine()
      key match {
        case "push" =>
          println("请输入一个数")
          val i: Int = StdIn.readInt()
          stack.push(i)
        case "list" =>
          stack.list()
        case "pop" =>
          println(stack.pop())
        case "peek" =>
          println(stack.peek())
      }
    }
  }

}

class ArrayStack(arrMaxSize: Int) {
  val maxSize = arrMaxSize
  val arr = new Array[Int](maxSize)
  var top = -1

  def push(num: Int): Unit = {
    if (isFull()) {
      println("栈满，不能push数据")
      return
    }
    top += 1
    arr(top) = num

  }

  def isEmpty(): Boolean = {
    top == -1
  }

  def isFull(): Boolean = {
    top == maxSize - 1
  }

  def list(): Unit = {
    if (isEmpty()) {
      println("栈空，不能遍历")
      return
    }
    for (i <- 0 to top reverse) {
      println(arr(i))
    }
  }

  def pop(): Any = {
    if (isEmpty()) {
      return new Exception("栈空")
    }
    val temp = arr(top)
    top -= 1
    temp
  }

  def peek(): Any = {
    if (isEmpty()) {
      return new Exception("栈空")
    }
    arr(top)
  }

}
