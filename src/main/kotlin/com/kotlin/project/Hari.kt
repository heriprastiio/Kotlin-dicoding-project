package com.kotlin.project


enum class Hari (val value: String) {
    SEN("Senin"){
        override fun printValue() {
            println("Hari Senin")
        }
    },
    SEL("Selasa"){
        override fun printValue() {
            println("Hari Selasa")
        }

    },
    RAB("Rabu"){
        override fun printValue() {
            println("Hari Rabu")
        }
    };

abstract fun printValue()
}
fun main(){
    val HariList = Hari.SEN.printValue()
    print(HariList)
}
