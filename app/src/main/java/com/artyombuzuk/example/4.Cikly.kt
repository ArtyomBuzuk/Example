package com.artyombuzuk.example

fun main() {
    for (n in 1..9)
        print("${n * n}\t")
    println("\n__________________________________")

    for (i in 1..9) {
        for (j in 1..9) {
            print("${i * j}\t")
        }
        println()
    }

    var i = 10
    while (i > 0) {
        print("${i * i}\t")
        i--
    }
    println()


    i = -1
    do {
        println(i * i)
        i--
    } while (i > 0)


    for (n in 1..10) {
        if (n == 6) continue
        println(n * n)
    }

    for (n in 1..10) {
        if (n == 5) break
        println(n * n)
    }

}