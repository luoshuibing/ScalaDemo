package com.jd.bigdata.scala.six

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ScalaToJava {

  def main(args: Array[String]): Unit = {
    val arr: ArrayBuffer[String] = ArrayBuffer("1", "2", "3")
    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)
    val arrList = javaArr.command()
    println(arrList)

    val scalaArr:mutable.Buffer[String]=arr
    scalaArr.append("jack")
    println(scalaArr)
  }

}
