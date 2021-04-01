package com.kotlin.project

class Animal {
    var name : String = "Miaouw"
}
fun main(){
    val cat = Animal()
    println("Nama: ${cat.name}")
    cat.name = "Goose"
    println("Nama ${cat.name}")
}