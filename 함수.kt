package com.androidmns.hello

import kotlin.math.pow

fun main() {
    //return 값이 없는 경우
    sum01(10,20)
   println( sum03(10,20))

    //함수의 overloading
    some("abc")
    some(10)
    some(10,"abc")
    //----------------

    //함수의 기본값
    sayHello1("kim")
    sayHello1()
    //-----------

    // 힘수의 null
    sayHello2("Kim")
    sayHello2(null)
    //--------


    //가변인수
    varFun("a","b","c")
    varFun("a","b","c","d")

    //BMI
    val resultText = bmiCalculation(75,170)
    println("당신은 $resultText 입니다.")


}//main

fun bmiCalculation(weight: Int, height: Int): String{ //리턴은 String Type
    var weightDouble = weight.toDouble()
    var heightDouble = height.toDouble() / 100.0

    var bmiCalc: Double = weightDouble / heightDouble.pow(2)

    println("BMI 지수 : %.2f".format(bmiCalc))

   return when(bmiCalc){
        in 1.0..18.5 -> "저체중"
        in 18.5 .. 23.0 -> "정상"
        in 23.0 .. 25.0 -> "과체중"
        in 25.0 .. 30.0 -> "비만"
        else -> "고도 비만"
    }
}


fun<T> varFun(vararg array: T){ //vararg 베리어블 알규먼트? -> 변수가 변할 수 있다
    for (a in array){
        println(a)
    }

}

fun sayHello1(name: String = "Anonymous"){
    println("Hello $name")
}

fun sayHello2(name: String?){
    if (name == null){
        print("Hello Anonymous")
    }else{
        print("Hello $name")
    }
}


fun some(a:String){

}

fun some(a: Int){

}

fun some(a: Int, b: String){

}


fun sum01(a:Int,b:Int){
    println(a+b)
}

fun sum03(a:Int, b: Int) : Int = a +b