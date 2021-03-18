package com.androidmns.hello

fun main(){
     println(getLength("Hello"))
    println(getLength(123))

    //Type 변환
    val a1: Int = 10
    var a2: Double = a1.toDouble()
}

fun getLength(obj: Any):Int{
    if (obj is String){
        return obj.length
    }
    return obj.toString().toInt()
}