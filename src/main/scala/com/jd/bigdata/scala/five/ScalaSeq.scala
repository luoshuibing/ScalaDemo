package com.jd.bigdata.scala.five

import scala.collection.mutable
import scala.collection.mutable.ListBuffer


/**
 * Scala中集合分为可变（mutable）和不可变（immutable）
 */
object ScalaSeq {

  def main(args: Array[String]): Unit = {
    //序列seq
    val list1: List[Int] = List(1, 2, 3, 4)
    println(list1(0))
    val list2: List[Int] = list1 :+ 1
    val list3: List[Int] = 2 +: list2
    list2.foreach(println)
    println(list2.mkString("|"))
    println(list3.mkString("|"))
    //val list4: List[Int] = list1.++(list3)
    val list4: List[Int] = list1 ++ list3
    println(list4.mkString("|"))

    //
    //val ints: List[Int] = list1.::(99)
    val ints: List[Int] = 99 :: list1

    println(ints.mkString("|"))

    val list: List[Any] = 999 :: list1 ::: list2
    //val list: List[Any] = 999 :: list1 :: list2
    println(list.mkString("=="))
    //特殊集合空集合
    println(List())
    println(Nil)

    //修改
    println(list.updated(2, 5).mkString("|"))

    //查询数据
    for (elem <- list) {
      println(elem)
    }

    val list5: List[Any] = list.drop(2)
    println(list5.mkString("...."))


    val ints1: ListBuffer[Int] = ListBuffer(1, 2, 3, 4)

    //集合的头
    println(ints1.head)
    //集合最后一个元素
    println(ints1.last)
    println(ints1.tail)
    println(ints1.init)

    //队列一定是可变的
    val q: mutable.Queue[Int] = mutable.Queue(1, 2, 3, 4)
    q.enqueue(5)
    println(q)
    val i: Int = q.dequeue()
    println(i)
    println(q)



  }

}
