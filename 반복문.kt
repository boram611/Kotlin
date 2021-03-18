package com.androidmns.hello



fun main() {
    for (i in 1..10){
        println(i)
    }

    // 1부터 100까지 합계 출력
    var sum: Int = 0
    for(i in 1..100){
        sum+=i
        }
    println("1부터 100까지의 합은 $sum 입니다")


    // 1~99
    for (i in 1 until 100){

    }

    //2 부터 100까지 짝수만
    for (i in 2..100 step 2){

    }

    // 100 부터 1까지 감수하면서 출력
    for(i in 100 downTo 1){

    }

    // 99 부터 1까지 홀수만 출력
    for (i in 99 downTo 1 step 2){

    }
    // 99 98 97 ... 90
    // 89 88 87 ... 80
    // :
    // 9 8 7 6 5 4 3 2 1

    for (i in 99 downTo 1) {
        print("$i ")
        if (i % 10 == 0) {
          println()
        }

    }

    for (i in 1..3){
        for (j in 1..3){
            if (j>i) break
            println("i: $i, j: $j")
        }
    }

    println("------------------")
    //break with label
    stop@for (i in 1..3){
        for (j in 1..3){
            if (j>i) break@stop
            println("i: $i, j: $j")
        }
    }
//---------------- 요기까지 4



}//===