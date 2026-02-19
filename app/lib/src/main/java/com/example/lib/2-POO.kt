package com.example.lib

//¿Qué debes hacer?
//• Crea la clase CuentaBancaria con propiedades: titular (String) y saldo (Double, empieza
//en 0.0).
//• Agrega el método depositar(cantidad: Double) que sume al saldo e imprima el nuevo
//saldo.
//• Agrega el método retirar(cantidad: Double) que reste del saldo SOLO si hay suficiente
//dinero; si no, imprime un mensaje de error.
//• Agrega el método mostrarSaldo() que imprima el saldo actual del titular.
//• Prueba la cuenta realizando al menos 3 operaciones distintas

class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0
    fun depositar(cantidad: Double) {
        saldo += cantidad
        println("Nuevo saldo: $saldo")
        // TODO
    }
    fun retirar(cantidad: Double) {
        if (saldo >= cantidad) {
            saldo -= cantidad
            println("Nuevo saldo: $saldo")
        } else {
            println("Error Sin saldo suficiente ")
        }
        // TODO: verifica que haya saldo suficiente
    }
    fun mostrarSaldo() {
        println("Saldo actual: $saldo")
        // TODO
    }
}
fun main() {
    val cuenta = CuentaBancaria("María García")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0) // No debe permitirlo
    cuenta.depositar(1000.0)
    cuenta.retirar(500.0)
    cuenta.retirar(1500.0) //no permitira
    cuenta.mostrarSaldo()
}