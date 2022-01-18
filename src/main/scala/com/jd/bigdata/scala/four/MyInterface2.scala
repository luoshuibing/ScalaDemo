package com.jd.bigdata.scala.four

object MyInterface2 {

  def main(args: Array[String]): Unit = {
    val mysql = new Mysql
    mysql.insert()
  }

}

trait Operate{
  println("operate")
  def insert(){
    print("插入数据")
  }
}
trait DB extends Operate{
  println("db")
  override def insert(): Unit ={
    print("向数据库")
    super[Operate].insert()
  }
}
trait File extends Operate{
  println("file")
  override def insert(){
    print("向文件")
    super.insert()
  }
}
/**
 * 多特质混入时，代码执行顺序为从左到右，如果有父特质，会优先执行
 * 多特质混入时，方法调用的顺序为从右到左
 * 特质中super关键字不是指代父特质，指代的是上一级特质
 * 如果希望super指向父特质，需要增加特殊操作：Super[特质]
 */
class Mysql extends File with DB with Serializable {

}
