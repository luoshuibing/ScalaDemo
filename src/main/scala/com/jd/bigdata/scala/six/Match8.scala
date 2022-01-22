package com.jd.bigdata.scala.six

object Match8 {

  def main(args: Array[String]): Unit = {
    val dollar = new Dollar(1)
    //value修饰符为final类型
    println(dollar.value)
    println(Dollar(2).value)
    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)) {
      val result=amt match{
        case Dollar(v)=>"$"+v
        case Currency(v,u)=>v+" "+u
        case NoAmount=>""
      }
      println(amt+":"+result)
    }

    println(dollar.copy(3).value)


  }

}

/**
 * 密封类，子类需要在一个文件中
 */
abstract sealed class Amount
case class Dollar(value:Double) extends Amount
case class Currency(value:Double,unit:String) extends Amount
case object NoAmount extends Amount
