package com.kotlin.project

class User(val name: String, val age: Int)
{
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name: String, val age: Int)

fun main(){
    val user = User("Heri", 23)
    val datauser = DataUser("Sunday", 56)
    val datauser2 = datauser.copy()
    println(user)
    println(datauser)
    println(datauser2)

}