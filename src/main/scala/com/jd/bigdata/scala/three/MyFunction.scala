package com.jd.bigdata.scala.three

object MyFunction {

  def main(args: Array[String]): Unit = {

    def test1(s: String): Unit = {
      println(s)
    }

    test1("hello world")

    //无参无返回值
    def test2(): Unit = {
      println("test2")
    }

    test2()

    //有参无返回值
    def test3(s: String): Unit = {
      println("test3")
    }

    test3("abcd")

    //有参有返回值
    def test4(s: String): String = {
      return s + "...."
    }

    println(test4("test4"))

    //无参有返回值
    def test5(): String = {
      return "abc"
    }

    println(test5())

    //scala中没有throws关键字，所以函数中如果有异常发送，也不需要在函数声明时抛出异常
    //如果函数申明明确无返回值Unit，即使函数体有return也不起作用
    def test6(): Unit = {
      return "hello"
    }

    println(test6())

    //如果将函数的最后一行代码进行返回，那么return关键字可以省略
    def test7(): String = {
      "abcd"
    }

    println(test7())

    //如果大括号只有一行代码可以将大括号省略
    def test8(): String = "ab"

    //可以根据最后一行代码推断返回值类型，那么返回值类型可以省略
    def test9() = "abcd"

    //如果函数体没有参数，小括号也可以省略
    def test10 = "abcde"

    println(test8())

    println(test9())

    println(test10)

    val f: () => Unit = () => {
      println("heelo")
    }
    f()

    //可变参数
    def test11(name: String*): Unit = {
      for (elem <- name) {
        println(elem)
      }
    }

    test11("zs", "ls", "ww")
    test11()

    def test12(name: String, age: Int = 20): Unit = {
      println(s"$name-$age")
    }

    test12("zs")
    test12("zs", 30)


    //带名参数
    test12(age = 21, name = "ls")

    def m(): Unit = {
      println("hello 111")
    }

    def m0() = {
      //有歧义
      m _
    }

    m0()()


    //闭包，一个函数在实现逻辑时，将外部的变量引入到函数的内容，改变了这个变量的生命周期，称之为闭包
    def f1(i: Int) = {
      def f2(j: Int): Int = {
        i * j
      }

      f2 _
    }

    println(f1(2)(3))

    //函数柯里化
    def mm1(i: Int)(j: Int) = {
      i * j
    }

    def n1(f: () => Int): Int = {
      f() + 10
    }

    def n2(): Int = {
      5
    }

    println(n1(n2))

    def o1(f: () => Unit): Unit = {
      f()
    }
    //使用匿名函数改善代码
    o1(() => {
      println("xxxxx")
    })

    def o2(f: (Int) => Unit): Unit = {
      f(10)
    }

    o2((i: Int) => {
      println(i)
    })
    o2(i => println(i))
    o2(println(_))
    o2(println)

    def p(f:(Int,Int)=>Int):Int={
      f(10,10)
    }

    def p1(i:Int,j:Int):Int={
      i+j
    }

    println(p(p1))

    println(p((x,y)=>x+y))
    println(p(_+_))


    def dg(i:Int): Int ={
      if(i==1){
        return 1
      }
      dg(i-1)*i
    }
    println(dg(5))

    lazy val res=sum(10,20)
    println("------------------------")
    println("------------------------")
    println("------------------------")
    println("------------------------")
    println("------------------------")
    println("------------------------")
    println("res="+res)

    def sum(n1:Int,n2:Int):Int={
      println("sum()执行了")
      n1+n2
    }

    try{
      val r=10/0
    }catch{
      case ex:ArithmeticException=>println("除零异常")
      case ex:Exception=>println("捕获了异常")
    }finally{
      println("scala finally...")
    }

  }


}
