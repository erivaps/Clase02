package com.kotlin.miprimeraapp.clase02
//interfaces
interface AlumnoDao {
    fun guardarAlumno()
    fun buscarAlumno()
    fun eliminarAlumno()
    fun actualizarAlumno()
}

class AlumnoDaoImp:AlumnoDao{
    private var nombre:String?=null
    override fun guardarAlumno() {
        TODO("not implemented")
    }

    override fun buscarAlumno() {
        TODO("not implemented")
    }

    override fun eliminarAlumno() {
        TODO("not implemented")
    }

    override fun actualizarAlumno() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getNombre(): String{
        return this.getNombre()
    }
}

fun main(args: Array<String>){
    var alumnoDao:AlumnoDao =  AlumnoDaoImp()
    var alumno5 = AlumnoDaoImp()
}