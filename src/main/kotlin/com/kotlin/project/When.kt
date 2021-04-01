package com.kotlin.project

fun main(){
    val nilai = null
    val range = 1..10
    when(nilai){
        in range -> println("Nilai dalam range")
        !in range -> println("Nilai diluar range")
        else -> println("Nilai tidak didefinisikan")
    }
}