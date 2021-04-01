package com.kotlin.project

fun main() {
    val valueA = 101
    val valueB = 52
    val valueC = 99
    val resultA = calculate(valueA,valueB,valueC)
    val resultB = calculate(valueA,valueB,null)
    println("""
        Hasil A adalah $resultA
        Hasil B adalah $resultB
    """.trimIndent())
}


fun calculate(valueA: Int, valueB: Int, valueC: Int?) : Int{
//    val result = valueA + (valueB - valueC!!)
//    val result = valueB + (valueB - 50)
    val valueC = valueC?:50
    val result = valueA+(valueB-valueC)
    return result

}