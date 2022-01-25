package com.jd.bigdata.scala.data.structure

import scala.util.control.Breaks._

object DoubleLinkedListDemo {

  def main(args: Array[String]): Unit = {
    val myDoubleLinkedList = new MyDobuleLinkedList
    val node1 = new DoubleHeroNode(1, "宋江", "及时雨")
    val node2 = new DoubleHeroNode(2, "卢俊义", "玉麒麟")
    val node3 = new DoubleHeroNode(3, "吴用", "智多星")
    val node4 = new DoubleHeroNode(4, "张飞", "翼德")
    myDoubleLinkedList.add(node1)
    myDoubleLinkedList.add(node2)
    myDoubleLinkedList.add(node3)
    myDoubleLinkedList.add(node4)
    myDoubleLinkedList.update(new DoubleHeroNode(4, "公孙胜", "入云龙"))
    myDoubleLinkedList.list()
    myDoubleLinkedList.delete(1)
    myDoubleLinkedList.list()
  }

}


class MyDobuleLinkedList {
  val head = new DoubleHeroNode(-1, "", "")

  def add(heroNode: DoubleHeroNode): Unit = {
    var temp = head
    breakable {
      while (true) {
        if (temp.next == null) {
          break()
        }
        temp = temp.next
      }
    }
    temp.next = heroNode
    heroNode.pre = temp
  }

  def isEmpty(): Boolean = {
    head.next == null
  }

  def list(): Unit = {
    if (isEmpty()) {
      println("链表为空，无法遍历")
      return
    }
    var temp = head.next
    breakable {
      while (true) {
        if (temp == null) {
          break()
        }
        println(s"${temp.name} ${temp.nickname} ${temp.no}")
        temp = temp.next
      }
    }
  }

  def update(heroNode: DoubleHeroNode): Unit = {
    if (isEmpty()) {
      println("链表为空")
      return
    }
    var temp = head.next
    var flag = false
    breakable {
      while (true) {
        //比较
        if (temp.no == heroNode.no) {
          flag = true
          break()
        }
        if (temp.next == null) {
          break()
        }
        temp = temp.next
      }
    }

    if (flag) {
      temp.nickname = heroNode.nickname
      temp.name = heroNode.name
    } else {
      println(s"你要修改的英雄${heroNode.no}不存在")
    }
  }

  def delete(no: Int): Unit = {
    if (isEmpty()) {
      println("链表空")
      return
    }
    var temp = head.next
    var flag = false
    breakable {
      while (true) {
        if (temp.no == no) {
          flag = true
          break()
        }
        if (temp.next == null) {
          break()
        }
        temp = temp.next
      }
    }
    if (flag) {
      temp.pre.next = temp.next
      if(temp.next!=null){
        temp.next.pre = temp.pre
      }
    } else {
      println(s"删除的节点${no}没有找到")
    }
  }

}


class DoubleHeroNode(hNo: Int, hName: String, hNickname: String) {
  val no = hNo
  var name = hName
  var nickname = hNickname
  var next: DoubleHeroNode = null
  var pre: DoubleHeroNode = null
}
