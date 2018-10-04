package com.kotlin.miprimeraapp.clase02

fun main(args: Array<String>) {
factorial()
}

fun factorial(){
    println("Ingrese número:")
    var numero:Int = readLine()!!.toInt()
    var resultado = 1
    for (x in 1..numero){
        resultado *= x
    }

    println("El Factorial es: $resultado")
}
