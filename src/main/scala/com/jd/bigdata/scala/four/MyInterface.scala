package com.jd.bigdata.scala.four

/**
 * 接口
 * scala中没有接口的概念，有特质的概念，类似于接口
 */
object MyInterface {
  def main(args: Array[String]): Unit = {
    //scala中的特质也无法构件对象
    //scala中的特质是可以执行代码
    //scala特质中声明的属性和方法都可以在混入的类中
    val sky = new Sky
    sky.username="lisi"
    sky.test()
    sky.test1()
  }
}

//声明特质
trait InterfaceTz1 {

}
trait InterfaceTz2 {
//  println("xxxxxxx")
  var username:String="zhangsan"
  def test():Unit={
    println("test ......")
  }
  def test1()
}
class SkyP{

}
/**
 * 特质可以继承的，所以使用extends关键字
 * 如果类继承多个特质，采用with连接
 * 如果类同时存在父类和特质，依然采用继承方式
 */
class Sky extends SkyP with InterfaceTz1 with InterfaceTz2{
  override def test1(): Unit = {
    println("test1")
  }
}