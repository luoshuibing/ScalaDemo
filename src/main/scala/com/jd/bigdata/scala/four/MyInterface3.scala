package com.jd.bigdata.scala.four

object MyInterface3 {

  def main(args: Array[String]): Unit = {
    //动态混入，扩展性非常强
    val air = new Air() with AirTrait
    air.test()
  }

}

trait AirTrait{
  def test(){
    println("test")
  }
}
class Air{

}


