package com.jd.bigdata.scala.data.structure

import util.control.Breaks._

object HashTableDemo {

  def main(args: Array[String]): Unit = {
    val table = new HashTable(5)
    val emp1 = new Emp(5, "1")
    val emp2 = new Emp(10, "1")
    val emp3 = new Emp(15, "1")
    val emp4 = new Emp(20, "1")
    val emp5 = new Emp(6, "1")
    val emp6 = new Emp(11, "1")
    val emp7 = new Emp(16, "1")
    val emp8 = new Emp(21, "1")
    table.addEmp(emp1)
    table.addEmp(emp2)
    table.addEmp(emp3)
    table.addEmp(emp4)
    table.addEmp(emp5)
    table.addEmp(emp6)
    table.addEmp(emp7)
    table.addEmp(emp8)
    table.list()
    println("----------------------------")
    table.findById(5)
    table.findById(10)

  }

}

class HashTable(size: Int) {
  val empLinkedList = new Array[EmpLinkedList](size)

  for (i <- 0 until size) {
    empLinkedList(i) = new EmpLinkedList
  }

  def addEmp(emp: Emp): Unit = {
    val index = hash(emp.no)
    empLinkedList(index).add(emp)
  }

  def list(): Unit = {
    for (i <- 0 until size) {
      empLinkedList(i).list()
      println("===================")
    }
  }

  def hash(no: Int): Int = {
    no % size
  }

  def findById(no: Int): Unit = {
    val i: Int = hash(no)
    val emp: Emp = empLinkedList(i).getEmpByNo(no)
    if (emp != null) {
      println(s"${emp.no} ${emp.name}")
    } else {
      println("没有雇员信息")
    }
  }

}

class EmpLinkedList {
  var head: Emp = null

  def getEmpByNo(no: Int): Emp = {
    if (head == null) {
      return null
    }
    var cur = head
    breakable {
      while (true) {
        if (cur.no == no) {
          break()
        }
        if (cur.next == null) {
          cur = null
          break()
        }
        cur = cur.next
      }
    }
    cur
  }

  def add(emp: Emp): Unit = {
    if (head == null) {
      head = emp
    } else {
      var cur = head
      breakable {
        while (true) {
          if (cur.next == null) {
            break()
          }
          cur = cur.next
        }
      }
      cur.next = emp
    }
  }

  def list(): Unit = {
    if (head == null) {
      println("空")
      return
    }
    var cur = head
    breakable {
      while (true) {
        println(s"${cur.no}  ${cur.name}")
        if (cur.next == null) {
          break()
        }
        cur = cur.next
      }
    }
  }
}

class Emp(empNo: Int, eName: String) {
  val no = empNo
  val name = eName
  var next: Emp = null
}