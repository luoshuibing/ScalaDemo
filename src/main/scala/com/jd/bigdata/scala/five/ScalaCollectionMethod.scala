package com.jd.bigdata.scala.five

/**
 * Scala中集合分为可变（mutable）和不可变（immutable）
 */
object ScalaCollectionMethod {

  def main(args: Array[String]): Unit = {
    //集合中常用的方法
    val list = List(1, 2, 3, 4, 2, 3)
    //求和
    println(list.sum)
    //最小值
    println(list.min)
    //最大值
    println(list.max)
    //乘积
    println(list.product)
    //反转，无排序
    println(list.reverse)
    //分组
    println(list.groupBy(i => 2 * i))
    //sortBy排序
    val sortByList: List[Int] = list.sortBy(i => i)
    println(sortByList)
    //升序降序排列
    println(list.sortWith((x, y) => x > y))
    println(list.map(i => (i, 1)))


    println(list.map(i => (i, 1)).groupBy(i => i._1).map(t => (t._1, t._2.size)))
    println(list.map(i => (i, 1)).groupBy(i => i._1))
    //取前多少个
    println(list.take(1))

    //扁平化
    val strings = List("hello world", "hello hbase", "hello kafka")
    val flatMapList: List[String] = strings.flatMap(s => s.split(" "))
    println(flatMapList)

    //过滤
    println(list.filter(x => x % 2 == 0))

    //ZIP拉链
    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6,7,3)
    val tuples: List[(Int, Int)] = list1.zip(list2)
    println(tuples.mkString("|"))

    //并集
    println(list1.union(list2))
    //交集
    println(list1.intersect(list2))
    //差集
    println(list1.diff(list2))
  }

}
