package com.androidmns.hello

fun main(){
    //List :  정해진 크기의 자료만 구성
    val list01: List<String> = listOf("유비", "관우")

    // Mutable List :  정해지지 않은 크기의 자료 구성
    val list02: MutableList<String> = mutableListOf("유비","관우")
    list02.add("장비")
    println(list02)
    list02.add(1,"여포")
    println(list02)
    list02.remove("장비")
    println(list02)
    list02.removeAt(1)
    println(list02)

    //ArrayList
    val arrayList: ArrayList<String> = ArrayList()
    arrayList.add("유비")
    arrayList.add("관우")
    arrayList.add("장비")
    println(arrayList)

    arrayList.remove("관우")
    println(arrayList)
}