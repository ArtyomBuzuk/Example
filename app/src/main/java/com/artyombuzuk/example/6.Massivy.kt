package com.artyombuzuk.example

fun main(){
    val numbers:Array<Int>
    val numbers1:Array<Int> = arrayOf(1,2,3,4,5)

    var n=numbers1[1]
    println(n)

    numbers1[2]=7
    n=numbers1[2]
    println(n)

    val numbers2 = Array(3,{5})
    
}