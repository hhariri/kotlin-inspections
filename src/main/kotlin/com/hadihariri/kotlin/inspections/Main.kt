package com.hadihariri.kotlin.inspections

import java.math.BigDecimal

fun sum(x: Int, y: Int) = x + y

fun returningUnit(param: String): Unit {

}

fun add(x: Int, y: Int) = x + y

private val Int.bd: BigDecimal
    get() {
        return BigDecimal(this)
    }

fun main(args: Array<String>) {
    val unusedVar = 100

    val redundantSemicolon = 200;


    println(redundantSemicolon)

}

fun usingTwoSpaces() {
  val someValue = "At least you're not using TABS!"
  println("But you insist on two spaces!")
}


fun doesSomething(x: Int) {
    if (x < 100) {
        println("Writing output")
    }
}

fun doesSomethingElse(y: Int) {
    if (y < 100) {
        println("Writing output")
    }
}