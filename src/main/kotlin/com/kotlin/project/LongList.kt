package com.kotlin.project

class LongList : List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }

}

/*class ArrayList<T> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }

}*/

fun main(){
    val longList = ArrayList<Long>()
    val firstLong = longList.get(0)
}

//class ArrayList<T>