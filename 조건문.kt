package com.androidmns.hello

import java.util.*

fun main() {
    val num1 = 5
    if(num1 < 10){
        println("$num1 < 10")
    }

    if (num1 > 0 && num1 <= 10){
        println("10 < $num1 <= 10")
    }else if (num1 > 10 && num1 <= 20){
        println("10 < $num1 <= 20")
    }else{
        println("$num1 > 20")
    }


    // 요기는 심플리 파이인지 뭔지.. 간단하게 쓰는법
    if (num1 in 1..10){
        println("10 < $num1 <= 10")
    }else if (num1 in 11..20){
        println("10 < $num1 <= 20")
    }else{
        println("$num1 > 20")
    }


    //if  표현식
    val result = if (num1 > 10) "유비" else "관우" // 중괄호 쓸 수 있음 써도되고 안 써도되고
    println(result)

    val result2 = if (num1 < 10){
        print("유비 : ")
        10 + 20
    }else{
        print("관우 :")
        20 + 20
    }
    println(result2)

    // When 표현식
    //스위치문의라고 생각하라고 하셨나..?

    val num2 = 1
    when(num2){
        1 -> println("num2 == 1")
        2 -> println("num2 == 2")
        else ->{ //스위치의 디폴트
            println("num2 is neither 1 nor 2")
        }
    }


    val data1 = "Apple"
    when(data1){
        "Apple" -> println("Iphone")
        "samsung" -> println("Galaxy")
        else -> println("data1 is not Apple or sumsang")
    }


    //여러 값을 조건으로 표현
    val data2 = 30
    when(data2){
        10, 20 -> println("data2 is 10 or 20")
        30, 40 -> println("data2 is 30 or 40")
        else -> println("?????")
    }

    //특정 범위를 조건으로 표현
    val num3 = 15
    when(num3){
        !in 1..100 -> println("invalid data") // ! = not
        in 1..10 -> println("1 <= $num3 <= 10")
        in 11..20 -> println("11 <= $num3 < = 20")
        else -> println("$num3 > 20 ")
    }

    // list나 배열로 data 찾기

    var list = listOf<String>("유비","관우","장비") //<> Gerneric :  데이터의 타입 정의
    var array = arrayOf("조조","여포","초선")
    val data4 = "초선"
    when(data4){
        in list -> println("$data4 is in list")
        in array -> println("$data4 is in array")
    }


    // if-else 의 대체
    val data5 = 15
    if (data5 <= 10){
        println("$data5 < 10")
    }else if (data5 in 11..20){
        println("10 < $data5 <=20")
    }else{
        println("$data5 > 20")
    }

    // When으로 변경하기
    when(data5){
        in 0..10 -> println("$data5 < 10")
        in 11..20 ->   println("10 < $data5 <=20")
        else ->  println("$data5 > 20")
    }

    when{
        data5 <= 10 -> println("$data5 < 10")
        data5 in 11..20 ->   println("10 < $data5 <=20")
        else ->  println("$data5 > 20")
    }

    // 함수를 이용한 다양한 타입의 데이터에 대한 조건식 처리

    testWhen(1)
    testWhen("Apple")
    testWhen(true)

    // 사용자가 입력한 숫자가 짝수인지 홀수인지 판별
    print("숫자를 입력하세요!")
    var inputValue: Int = readLine()!!.toInt() // 사용자에게 받아오는거 readLine  !! => 강제 언랩핑 .to 여기는 형변환
    if (inputValue % 2 == 0){
        println("$inputValue 는(은) 짝수 입니다.")
    }else{
        println("$inputValue 는(은) 홀수입니다.")
    }

    quiz()

    }// end main function

fun quiz(){
//-----------------------------------------
//        *** 19세 이상의 BMI 계산기 *****
//        몸무게를 입력하세요! (kg) :
//        키를 입력하세요! (cm) :
//         BMI 지수 :
//         비만입니다.
// ------------------------------------------

    println("*** 19세 이상의 BMI 계산기 ***")
    print("몸무게를 입력하세요! (kg) :")
    var weight : Double = readLine()!!.toDouble()
    print("키를 입력하세요! (cm) :")
    var height : Double = readLine()!!.toDouble()

    var bmi : Double = weight/((height/100) * (height/100))
    println("BMI 지수 : $bmi")

    when{
        bmi > 30 -> println("비만입니다")
        bmi >= 25 && bmi < 30 -> println("과체중입니다")
        bmi >= 18.5 && bmi < 25 -> println("정상체중입니다")
        else -> println("저체중입니다")
    }

}



fun testWhen(data: Any){
    when(data){
        1 -> println("data value is 1")
        "Apple" -> println("data value is Apple")
        is Boolean -> println("data type is Boolean") //boolean은 true, false로 정의 안해서 그런다했나..?
    }
}//-----