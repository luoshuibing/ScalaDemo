package com.jd.bigdata.scala.four

object MyInterface1 {

  def main(args: Array[String]): Unit = {
    new Shop()
  }

}
//特质和父类没有关系，只和当前混入的类有关系，所以，在调用时，父类先执行，然后当前类再执行
//如果父类混入了相同的特质，那么特质的代码只会执行一遍
trait ShopTrait{
  println("trait code...")
}
class ShopP extends ShopTrait {
  println("Parent code...")
}

class Shop extends ShopP with ShopTrait {
  println("child code...")
}