package com.jd.bigdata.scala.data.structure

object Maze {

  def main(args: Array[String]): Unit = {
    val array: Array[Array[Int]] = Array.ofDim[Int](8, 7)
    //最上面和最下面
    for (i <- 0 until 7) {
      array(0)(i) = 1
      array(7)(i) = 1
    }
    //最左边和最右边
    for (i <- 0 until 8) {
      array(i)(0) = 1
      array(i)(6) = 1
    }

    array(3)(1)=1
    array(3)(2)=1
    array(2)(2)=1
    setWay(array,1,1)

    for (row <- array) {
      for (col <- row) {
        print(col + " ")
      }
      println()
    }




  }

  /**
   * 完成递归回溯找路
   *
   * @param map
   * @param i 表示现在正在探测纵坐标
   * @param j 表示现在正在探测横坐标
   */
  def setWay(map: Array[Array[Int]], i: Int, j: Int): Boolean = {
    //2表示探测过
    if (map(6)(5) == 2) {
      true
    } else {
      //0,1,2,3,0没探测过，1墙，2经过，3没路
      if (map(i)(j) == 0) { //没有探测过
        //下右上左
        map(i)(j) = 2
        if (setWay(map, i + 1, j)) {
          true
        } else if (setWay(map, i, j + 1)) {
          true
        } else if (setWay(map, i - 1, j)) {
          true
        } else if (setWay(map, i, j - 1)) {
          true
        } else {
          map(i)(j) = 3
          false
        }
      } else {
        false
      }
    }
  }

}
