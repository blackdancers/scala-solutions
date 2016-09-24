package com.atomic.scala.expressions

/**
 * 组合表达式
 */
object CompoundExpressions {
  def main(args: Array[String]): Unit = {
//    var str = 12
//    str = 12.3
    
    val activity = "Swimming"
    val hour = 10
    val isOpen = {
      if (activity == "Swimming" || activity == "ice skating") {
        val opens = 9
        val closes = 20
        println("Operating hours:" + opens + "-" + closes)
        val isOK = (hour >= opens && hour <= closes)
        //println("isOK:"+isOK)
        isOK
      } else {
        false
      }
    }
    println(isOpen)
  }
}