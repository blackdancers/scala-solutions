package com.atomic.scala.expressions

/**
 * Scala 表达式
 */
object Solution {
  def main(args: Array[String]): Unit = {
    //创建表达式，初始化为5280
    val feetPerMile = 5280
    val yardsPerMile = feetPerMile / 3.0
    val miles = 2000 / yardsPerMile
    println(feetPerMile)
    println(yardsPerMile)
    println(miles)
    //创建组合表达式
    val yards = { // : Double 可以不加返回值类型
      val feetPerMile2 = 5280
      feetPerMile2 / 3.0
    }
    val miles2 = 2000 / yards

    println("-----------------------")
    println(yards)
    println(miles2)

  }

}