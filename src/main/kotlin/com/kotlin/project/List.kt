package com.kotlin.project

interface List<A> {
    operator fun get(index: Int): A
}