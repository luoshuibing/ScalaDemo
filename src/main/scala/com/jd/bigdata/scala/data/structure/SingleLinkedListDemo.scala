package com.jd.bigdata.scala.data.structure

import scala.util.control.Breaks._

object SingleLinkedListDemo {

  def main(args: Array[String]): Unit = {
    val singleLinkedList = new SingleLinkedList;
    val node1 = new HeroNode(1, "宋江", "及时雨")
    val node2 = new HeroNode(2, "卢俊义", "玉麒麟")
    val node3 = new HeroNode(3, "吴用", "智多星")
    val node4 = new HeroNode(4, "张飞", "翼德")
    singleLinkedList.addOrder(node3)
    singleLinkedList.addOrder(node1)
    singleLinkedList.addOrder(node4)
    singleLinkedList.addOrder(node2)
    singleLinkedList.addOrder(node2)
    singleLinkedList.list()


    //singleLinkedList.update(new HeroNode(4, "公孙胜", "入云龙"))
    //singleLinkedList.list()
    //
    //println("====================")
    //singleLinkedList.delete(1)
    //singleLinkedList.list()
    //println("====================")
    //singleLinkedList.delete(4)
    //singleLinkedList.list()

    //singleLinkedList.delete(4)
  }

}

class SingleLinkedList {
  val head = new HeroNode(-1, "", "")

  def add(heroNode: HeroNode): Unit = {
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

  def update(heroNode: HeroNode): Unit = {
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
      println("链表为空")
      return
    }
    var temp = head
    var flag = false
    breakable {
      while (true) {
        if (temp.next.no == no) {
          flag = true
          break()
        }
        if (temp.next.next == null) {
          break()
        }
        temp = temp.next
      }
    }
    if (flag) {
      temp.next = temp.next.next
    } else {
      println(s"你要删除的节点${no}不存在")
    }
  }

  def addOrder(heroNode: HeroNode): Unit = {
    var temp = head
    var flag = false
    breakable {
      while (true) {
        if (temp.next == null) {
          break()
        }
        if (temp.next.no == heroNode.no) {
          flag = true
          break()
        } else if (temp.next.no > heroNode.no) {
          break()
        }
        temp = temp.next
      }
    }
    if (flag) {
      println(s"已经存在这个编号${heroNode.no}不能添加")
    } else {
      heroNode.next = temp.next
      temp.next = heroNode
    }

  }


}

class HeroNode(hNo: Int, hName: String, hNickname: String) {
  val no = hNo
  var name = hName
  var nickname = hNickname
  var next: HeroNode = null
}
