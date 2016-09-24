package com.atomic.scala.examples

/**
 * Scala 方法声明
 */
object MultiplyByTwo {

  def multiplyByTwo(x: Int): Int = {
    println("Inside multiplyByTwo")
    x * 2 //方法返回值
  }
  def main(args: Array[String]): Unit = {
    val r = multiplyByTwo(5)
    println(r)
  }

}