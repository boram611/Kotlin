package com.androidmns.hello

fun main() {
    //Pascal, Camel, Snake
    //AppleFruit, appleFruit, apple_fruit


    //변수 선언
    //val : value의 약자로 변경 불가능한 Assign-Once 변수(immutable)변수
    //var : variable의 약자로 변경ㅇ이 가능한 mutable 변수.

    //정수 변수의 선언
    var num1: Int = 10
    var num2: Int = 20
    println(num1+num2)


    //null을 허용하지 않고 data를 할당하는 변수의 선언
    val num3: Int
    val num4: Int? = null  //null을 허용할떄는 ? 를 붙여줌 옵셔널이라는 말 안쓰고 그냥 널을 허용하는 변수다 라고 함

    // Class 안의 전역변수와 지역변수의 초기화
    class User{
        val objData1: String = "String" //무적권 초기값 필요함

        fun some(){
            val location1:String // 함수 안에 지역변수에는 초기값을 안 줘도 됨
        }
    }

    // String Interpolation
    println("2+3 = ${num1 + num2}") //스위프트에서 \() 요거가 여기서는 ${}

    // 범위 연산자
    for (i in 3..5){
        print("$i ") //두가지 값 이상 쓸때는 {중괄호} 값 하나일떄는 (괄호)
    }
    println()

    // null 안전 관련 연산자
    var a:Int? = null
    var nullCheck = a ?: 10 //a가 null이면 10
    println(nullCheck)
    //이프랩 가드랩? 하고 똑같다고 하심.. 그게 뭔지 모르겠음.. if let?

    println("-------")
    // it 연산자
    val array1 = arrayOf(10, 20, 30)
    array1.forEach {
        // 안에서 반복한다 forEach
        println("$it")
    } //it이 뭔지.. 그것만


}