package com.jd.bigdata.scala.four

object ClassInfo {

  def main(args: Array[String]): Unit = {
    //scala如果想要获取类的信息，需要采用特殊的方法：classOf[类型]
    //classOf能直接使用，因为scala.Predef伴生对象是默认导入到当前开发环境中
    val value: Class[AirPort] = classOf[AirPort]
    //value.getInterfaces
    //可以使用type关键字各类起别名
    //type XXX=AirPort
    //val xxx = new XXX
    val port: Object = new AirPort
    val bool: Boolean = port.isInstanceOf[AirPort]
    if (bool) {
      val port1: AirPort = port.asInstanceOf[AirPort]
      println(port1)
    }
  }

}

class AirPort {

}
