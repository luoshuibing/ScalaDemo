package com.jd.bigdata.scala.six

object Clazz {

  def main(args: Array[String]): Unit = {
    test(new Soy)
    test(new Salt)
  }

  /**
   * <:表示泛型的上限，所以传递数据时，应该为子类或当前类
   * >:表示泛型的下限，和java不太一样，所以传递数据时，什么都可以传递
   * 协变，逆变   +   -
   * @param t
   * @tparam T
   */
  def test[T >: Soy](t: T): Unit = {
    println(t)
  }

}

class Vinegar {

}

class Soy extends Vinegar {

}

class Salt extends Soy {

}

class TestClazz[+Salt]{

}