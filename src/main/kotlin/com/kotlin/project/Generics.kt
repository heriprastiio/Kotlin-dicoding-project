package com.kotlin.project


fun main(){
    val nomor = (1..100).toList()
    print(nomor.slice<Int>(1..10))

}