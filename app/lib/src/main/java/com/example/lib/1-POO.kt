package com.example.lib

//Qué debes hacer?
//• Crea una clase llamada Persona con las propiedades: nombre (String), edad (Int) y
//ciudad (String).
//• Agrega un método saludar() que imprima: 'Hola, me llamo [nombre] y tengo [edad]
//años.'
//• Agrega un método esMayorDeEdad() que regrese true si la edad es mayor o igual a 18.
//• En la función main(), crea dos personas distintas y llama sus métodos.

class Persona(val nombre: String, val edad: Int, val ciudad: String) {
    fun saludar() {
        println("Hola, me llamo $nombre y tengo $edad años")
        // TODO: Imprime el saludo
    }
    fun esMayorDeEdad(): Boolean {
        // TODO: Regresa true si edad >= 18
        println("$nombre es mayor de edad: ${edad >= 18}")
        return edad >= 18
    }
}
fun main() {
    val persona1 = Persona("Ana", 20, "Guadalajara")
    val persona2 = Persona("Luis", 15, "León")

    persona1.saludar()
    persona1.esMayorDeEdad()
    persona2.saludar()
    persona2.esMayorDeEdad()

    // TODO: Llama los métodos de cada persona
}

/** Salida esperada
Hola, me llamo Ana y tengo 20 años.
Ana es mayor de edad: true
Hola, me llamo Luis y tengo 15 años.
Luis es mayor de edad: false
   */
