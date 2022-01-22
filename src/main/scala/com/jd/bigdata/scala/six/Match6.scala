package com.jd.bigdata.scala.six

object Match6 {

  def main(args: Array[String]): Unit = {
    object Square{
      def unapply(z:Double):Option[Double]=Some(math.sqrt(z))
      def apply(z:Double):Double=z*z
    }
    val number:Double=36
    number match{
      case Square(n)=>println(n)
      case _=>println("nothing matched")
    }
  }

}
