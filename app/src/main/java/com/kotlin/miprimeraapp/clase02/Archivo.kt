package com.kotlin.miprimeraapp.clase02

class Archivo<T> {
    var nombre:T?=null
    var ruta:T?=null

}

fun main(args: Array<String>){
    var archivo1 = Archivo<Int>()
    var archivo2 = Archivo<Array<String>>()

}