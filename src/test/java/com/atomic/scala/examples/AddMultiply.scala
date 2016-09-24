package com.atomic.scala.examples

object AddMultiply {
  /**
   * 三个不同的参数
   */
  def addMultiply(x: Int, y: Double, s: String): Double = {
    println(s)
    (x + y) * 2.1
  }

  def test(x: Int, y: Double, s: String, expected: Double): Unit = {
    val result = addMultiply(x, y, s)
    assert(result == expected, "Expected " + expected + "Got " + result)
    println(result)
  }

  def main(args: Array[String]): Unit = {
    val r2: Double = addMultiply(7, 9, "abc")
    println(r2)
    test(7, 9, "abc", 33.6)
  }

}