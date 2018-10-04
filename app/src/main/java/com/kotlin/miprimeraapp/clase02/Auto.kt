package com.kotlin.miprimeraapp.clase02

class camioneta {
    var tipo: String? = null
    var maximavelocidad: Int? = null
    var numeroAsientos: Int? = null
}


fun main(args: Array<String>){
    var variable = camioneta()
    variable.tipo = "Nissan"
    variable.maximavelocidad=200
    variable.numeroAsientos = 5

    println("Tpo: ${variable.tipo}")
    println("Tpo: ${variable.maximavelocidad}")
    println("Tpo: ${variable.numeroAsientos}")
}