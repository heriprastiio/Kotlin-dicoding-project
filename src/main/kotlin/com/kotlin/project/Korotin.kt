package com.kotlin.project
import kotlinx.coroutines.*
fun main() = runBlocking {
   /* launch {
        delay(2000L)
        println("Korotin")
    }
    println("Halo,")
    delay(5000L)*/
    val invest = getCapital()
    val returnInvest = getIncome()
    println("Cuan anda adalah ${returnInvest - invest}")

}
suspend fun getCapital(): Int{
    delay(1000L)
    return 50000
}
suspend fun getIncome(): Int{
    delay(1000L)
    return 75000
}