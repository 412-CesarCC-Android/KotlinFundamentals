package com.example.lib

//¿Qué debes hacer?
//• Crea la clase base Animal con propiedades: nombre (String) y edad (Int).
//• Agrega a Animal el método hacerSonido() que imprima: 'Sonido genérico.'
//• Agrega a Animal el método describirse() que imprima: 'Soy [nombre] y tengo [edad]
//años.'
//• Crea las clases Perro, Gato y Vaca que hereden de Animal.
//• Cada subclase debe sobreescribir hacerSonido() con su sonido propio (¡Guau!, ¡Miau!,
//¡Mu!).
//• En main(), crea un animal de cada tipo y llama sus métodos.

open class Animal(val nombre: String, val edad: Int) {
    open fun hacerSonido() {
        println("Sonido genérico.")
    }
    fun describirse() {
        println("Soy $nombre y tengo $edad años.")
    }
}
class Perro(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Guau!")
        // TODO: imprime ¡Guau!
    }
}

class Gato(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Miau!")
        // TODO: imprime ¡Miau!
    }
}

class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Mu!")
        // TODO: imprime ¡Mu!
    }
}

// TODO: Crea Gato y Vaca de forma similar
fun main() {
    val perro = Perro("Rex", 3)
    perro.describirse()
    perro.hacerSonido()
    val gato = Gato("VRad", 4)
    gato.describirse()
    gato.hacerSonido()
    val vaca = Vaca("tilin", 10)
    vaca.describirse()
    vaca.hacerSonido()
}
// TODO: Crea y usa Gato y Vaca