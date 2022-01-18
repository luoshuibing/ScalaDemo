package com.jd.bigdata.scala.three

//访问权限问题
package p1{
  package p2{
    class UserP2{
      var username="zhangsan"
      private var password="123123"
      protected var email="@123.com"
      private[p2] var address="xxxxx"
    }
  }
  package p3{

    import com.jd.bigdata.scala.three.p1.p2.UserP2

    class EmpP3 extends UserP2 {
      def test():Unit={
        val user=new UserP2
      }
    }
  }
}

/**
 * 类的属性
 */
object MyField {

  def main(args: Array[String]): Unit = {
    val user = new User0003
    println(user.username)
    user.username = "zhangsan"
    user.username_=("lisi")
    println(user.username)
    println(user.email)
//    user.clone()
  }

}

class User0003 {

  //scala中给类声明属性，默认为私有的，但是底层提供了公共的set和get方法
  var username: String = _

  //如果给属性添加private修饰符，那么属性无法在外部访问，因为底层生成的set和get方法也是私有的
  private var age: Int = _

  //如果声明的属性使用val，那么属性是私有的，并且使用final修饰，底层只提供getter方法，而没有setter方法
  val email: String = "abc@111.com"

}
