package com.kotlin.miprimeraapp.clase02
//Herencia
open class Alumno1 {
    var nombres: String? = null
    var edad: Int? =   null

    constructor(nombre: String?, edad: Int?) {
        this.nombres = nombre
        this.edad = edad

        println("Nombre: ${this.nombres}")
        println("edad: ${this.edad}")
    }
}

class Profesor: Alumno1{
    //cuadndo se hereda con () asume que no se modificar, de lo socntrrio d}se puede agrgar pellido
    constructor(nombres: String, edad: Int, apellidos: String):super(nombres, edad){
        println("Apellido: $apellidos")

    }

}


fun main (args: Array<String>){
    var alumno1 = Alumno1("Erison",21)
    var profesor1 = Profesor("Erison", 21, "MR")
    var alumno2 = Alumno(1,"Erison","12345678")

}