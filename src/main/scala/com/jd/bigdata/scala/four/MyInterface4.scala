package com.jd.bigdata.scala.four

object MyInterface4 {
  def main(args: Array[String]): Unit = {
    val plane = new AirPlane
    plane.getMessage
  }
}
//trait AirPlaneTrait extends Exception{
trait AirPlaneTrait{

  this:Exception =>
  def insert: Unit ={
    println("插入数据")
    this.getMessage
  }

}

class AirPlane extends Exception with AirPlaneTrait {

}
