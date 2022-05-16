package com.artyombuzuk.example

fun main(){
    var range = 1..5//1,2,3,4,5
    var range1 = "a".."b"
    var range2 = 5 downTo 1//5,4,3,2,1
    var range3 = 1..10 step 2//1,3,5,7,9
    var range4 = 10 downTo 1 step 3//10,7,4,1
    var range5 = 1 until 9//1,2,3,4,5,6,7,8
    var range6 = 1 until 9 step 2//1,3,5,7

    var range7 = 1..5
    var isInRange = 5 in range7
    println(isInRange)

    isInRange = 48 in range7
    println(isInRange)

    var isNotInRange = 6 !in range7
    println(isNotInRange)

    isNotInRange = 3 !in range7
    println(isNotInRange)


    var range8 = 5 downTo 1
    for (c in range8) print("$c\t")
    println()

    for (c in 1..9) print("$c\t")
    println()

    for(c in 1 until 9) print("$c\t")
    println()

    for (c in 1..10 step 2) print("$c\t")
    println()

}