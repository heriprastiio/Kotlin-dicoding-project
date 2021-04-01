package com.kotlin.project
import kotlinx.coroutines.*
fun main() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Profit anda ${income.await() - capital.await()}")
}