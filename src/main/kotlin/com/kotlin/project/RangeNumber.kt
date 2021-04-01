package com.kotlin.project

fun main() {
    val listNumber = 1.rangeTo(100)
//    for (number in listNumber) {
    for (number in listNumber) {
//        println("value is $number!")
        if (number % 2 == 0) continue
        if (number>15) break
        val result = number * (number +10)
        println("range result is $result")
    }
}