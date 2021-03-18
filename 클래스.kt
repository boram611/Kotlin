package com.androidmns.hello

fun main(){

    //Instance 생성
    val instance01 = MyClass()
    instance01.sayHello()

    var user01 = User1("유비", 20)
    var user02 = User2("장비")
    var user03 = User2("장비", 20)
    var user04 = User3("장비")
    var user05 = User3("장비", 20)
    var user06 = User3("장비",20,"abc@naver.com")

    val user07 = User4()
    user07.greeting = "Kim"
    println(user07.greeting)
}//---

class User4{
    var greeting: String = "Hello"
    set(value){
        field = "Hello!" + value
    }
    get() = field.toUpperCase()
    var age:Int = 0
}
class  User3(name: String){
    init {
        println("init: $name")
    }
    constructor(name: String,age: Int):this(name){
        println("constructor01 $name, $age" )
    }
    constructor(name: String,age: Int,email:String):this(name, age)
    {
        println("constructor02 $name $age $email")
    }
}



//Construction
class User2(name: String){ // 주생성자
    init {
        println("init: $name")
    }
    constructor(name: String, age: Int): this(name){
        println("constructor: $name, $age")
    }
}


class MyClass {
    var name: String = "Apple"

    fun sayHello() {
        println("Hello $name")
    }
}

class User1(name: String, age: Int){
    init {
        println("$name's age is $age")
    }
}
