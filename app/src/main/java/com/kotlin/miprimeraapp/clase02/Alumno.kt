package com.kotlin.miprimeraapp.clase02

class Alumno {
    var codigo: Int? = null
    var nombre: String? = null
    var documento: String? = null

    constructor(codigo: Int?, nombre: String?, documento: String?) {
        this.codigo = codigo
        this.nombre = nombre
        this.documento = documento

        println("Código: ${this.codigo}")
        println("Código: ${this.nombre}")
        println("Código: ${this.documento}")
    }
}

fun main (args: Array<String>){
    var alumno = Alumno(1,"Erison","01234567")
}