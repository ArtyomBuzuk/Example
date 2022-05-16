package com.artyombuzuk.example

fun main(){
    var a=45
    if (a==45){
        println("a=$a")
    }

    val b=25
    if(b==24){
        println("b=$b")
    } else{
        println("b ne = $b")
    }

    val c=50
    if (c==51)
        println("c=$c")
    else
        println("c ne=$c")

    val d=9
    if (d==8)
        println("d = 8")
    else if (d==9)
        println("d=9")
    else if (d==10)
        println("d=10")
    else
        println("d не определенно")

    val e=10
    val f=20
    val g=if (e>f) e else f
    println(g)

    a = 10
    when(a){
        10-> println("a=10")
        20-> println("a=20")
        else-> println("Error")
    }

    a=10
    when(a){
        10->{
            println("a=10")
            a*=2
        }
        20->{
            println("a=20")
            a*=5
        }
        else->{
            println("Error")
        }
    }
    println(a)

    a=10
    when(a){
        10,20-> println("a=10 или a=20")
        else-> println("Error")
    }

    a=21
    when(a){
        in 10..19-> println("a от 10 до 19")
        in 20..29-> println("a от 20 до 29")
        !in 10..20-> println("a вне диапозона от 10 до 20")
        else-> println("Error")
    }

    val sum = 1000
    val rate = when(sum){
        in 100..999->10
        in 1000..9999->15
        else->20
    }
    println(rate)

}