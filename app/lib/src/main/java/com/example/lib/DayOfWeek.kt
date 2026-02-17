 package com.example.lib

/**
 *
 * Escribir un programa que me muestre los dias de la semana
 * y si es sabado o domingo que escriba Fin de semana
 */
//
fun main() {
    val dayOfTheWeek = 2

    // ctrl + k , ctrl + c (COMENTAR)
    // ctrl + k , ctrl + u (DESCOMENTAR)
//    if(dayOfTheWeek == 1) {
//        println("Es lunes")
//    } else if (dayOfTheWeek == 2) {
//        println("Es Martes")
//    }


    when(dayOfTheWeek) {
        1 -> println("Es lunes")
        2 -> {
            println("Es martes")
            println("Haciendo mas cositas")
        }
        3 -> println("Es Miercoles")
        4 -> println("Es jueves")
        5 -> println("Es viernes")
        6,7 -> println("Es fin de semana")
        else -> println("No es un dia de la semana")
        // Haciendo un cambio
        // Haciebndo cambio 2
    }
}