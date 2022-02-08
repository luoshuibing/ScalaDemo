package com.jd.bigdata.scala.data.structure

object HannuTower {

  def main(args: Array[String]): Unit = {
    hannuoTower(40,'A','B','C')
  }

  /**
   * 如果只有一个盘，A->C
   * 如果有两个或者两个以上盘，将看成两个部分，最下面盘，和上面的盘
   * 将上面的盘A->B
   * 将最下面的盘A->C
   * 将B塔的所有盘移动到C，B->C
   * @param nums
   * @param a
   * @param b
   * @param c
   */
  def hannuoTower(nums: Int, a: Char, b: Char, c: Char): Unit = {
    if (nums == 1) {
      println("第一个盘从" + a + "->" + c)
    } else {
      hannuoTower(nums - 1, a, c, b)
      println("第" + nums + "个盘从" + a + "->" + c)
      hannuoTower(nums - 1, b, a, c)
    }
  }

}
