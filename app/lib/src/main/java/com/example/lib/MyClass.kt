package com.example.lib

fun main() {
    val name : String = "Juan" //inmutable
    var age : Int = 27 //mutable
    age = 29

    // For
    for(i in 1..10)
    {
        println(i)
    }

    for(i in 100 downTo 0 step 10) { // Step para que se cuente en 10 en 10
        println(i)
    }

    // Calculadora de propinas..

    /*
    * Crea un programa que tenga un precio de comida y un porcentaje de propina
    * el programa debe imprimir cuanto es de propina y cyanto es el total a pagar
    * */

    val precioComida = 500.0
    val percentage = 0.15

    val tip = precioComida * percentage
    val total = precioComida + tip
    println("El costo es " + precioComida)
    println("La propina es "+ tip)
    println()
    // String interpolation
    println("El costo es $$total")
    println("La propina es $tip")
}