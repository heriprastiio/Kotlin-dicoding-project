package com.kotlin.project

fun main() {
    val mapKotlin = mapOf(
        "val" to "var",
        "fun" to "method"
    )
    println(mapKotlin["val"])
    println(mapKotlin.getValue("val"))
    val mapkeys = mapKotlin.keys
    val mapvalue = mapKotlin.values
    println(mapkeys)
    println(mapvalue)
}