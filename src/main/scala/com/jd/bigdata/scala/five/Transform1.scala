package com.jd.bigdata.scala.five

object Transform1 {

  def main(args: Array[String]): Unit = {
    implicit def transfrom(ck:CK):Delete={
      new Delete
    }

    val ck=new CK;
    ck.select()
    ck.delete()

  }

}
class Delete{
  def delete():Unit={
    println("删除")
  }
}
class CK{
  def select():Unit={
    println("选择")
  }
}
