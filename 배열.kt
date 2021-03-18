package com.androidmns.hello

fun main() {
    // Data Type을 혼용해서 쓰는 Array
    var array = arrayOf<Any>(1, "Korea", true)
    println("${array[0]}...${array[1]}...${array[2]}")
    array[0] = 10

    println(array[0])

    // 정수만 사용하는 Array
    var arrayInt = arrayOf<Int>(10, 20, 30)
    println(arrayInt.max())
    println(arrayInt.reverse()) // 역순
    println(arrayInt.average())
    println(arrayInt.sorted())
    println(arrayInt.contains(7)) //false or ture 7을 포함하고 있냐

    // 정수 전용 Array
    var arrayInt2 = intArrayOf(10, 20, 30)

    // 실수 전용 Array
    var arrayDouble = doubleArrayOf(10.1, 10.2, 10.3)

    // 계산값을 Array에 전용 (Lambda 함수 사용)
    var array1 = Array(3) {i -> i * 10}
    var array2 = Array<Int>(3) {i -> i * 100}
    array1.forEach {
        println(it)
    }

    array2.forEach {
        println(it)
    }

    // 혼합형 Array의 초기값을 Null로 적용
    var array3 = arrayOfNulls<Any>(3)


}