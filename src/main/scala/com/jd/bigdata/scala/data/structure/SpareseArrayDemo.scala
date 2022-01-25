package com.jd.bigdata.scala.data.structure

import scala.collection.mutable.ArrayBuffer


object SpareseArrayDemo {

  def main(args: Array[String]): Unit = {
    val rows = 11
    val cols = 11
    val chessMap1: Array[Array[Int]] = Array.ofDim[Int](rows, cols)
    chessMap1(1)(2) = 1
    chessMap1(2)(3) = 2
    println("原始的棋盘")
    for (row <- chessMap1) {
      for (item <- row) {
        printf(s"$item ")
      }
      println()
    }
    //对原始的二维数组进行压缩
    //思路
    //1.创建一个ArrayBuffer，可以动态的添加数据
    //2.使用Node对象，表示一个数据
    val sparseArray = ArrayBuffer[Node]()
    sparseArray.append(new Node(11, 11, 0))
    //先将第一行数据放入
    //遍历棋盘
    for (i <- 0 until chessMap1.length) {
      for (j <- 0 until chessMap1(i).length) {
        if (chessMap1(i)(j) != 0) {
          sparseArray.append(new Node(i, j, chessMap1(i)(j)))
        }
      }
    }
    for (i <- 0 until sparseArray.length) {
      val node: Node = sparseArray(i)
      println(s"${node.row} ${node.col} ${node.value}")
    }

    val node: Node = sparseArray(0)
    val array: Array[Array[Int]] = Array.ofDim[Int](node.row, node.col)
    for(i<- 1 until sparseArray.length){
      val node1: Node = sparseArray(i)
      array(node1.row)(node1.col)=node1.value
    }

    for (row <- array) {
      for (item <- row) {
        printf(s"$item ")
      }
      println()
    }

  }

}

class Node(val row: Int, val col: Int, val value: Int)