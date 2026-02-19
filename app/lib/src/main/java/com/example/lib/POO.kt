package com.example.lib

class person(val name: String, val age : Int) {
//    public int age;
//    public String name;
//
//    public Person(Int age, String name) {
//        this.age = age;
//        this.name = name;
//    }}

    fun sayHello(language:String){
        if(language == "Spanish") {
        println("Hola soy $name y tengo $age años")
        } else {
            print("Hello I'm $name and I'm $age years old")
        }
    }

    fun caminar() : Double {
        return 10.0
    }
}
// ABSTRACCION
abstract class Shape{
    abstract fun calculateArea() : Double
}

class Square(val side: Double) : Shape() {
    override fun calculateArea(): Double {
        return side * side
    }
} 

class Circle(val radius : Double) : Shape() {
    override fun calculateArea() : Double{
        return Math.PI * radius * radius
    }
}

fun main() {
    val person = person("César Cázares", 20)
    val person2 = person(
        name = "César Cázares",
        age = 20
    )  // mas peresonalizado y facil para mantener (mas recomendado)

    // val figura = Shape() --> ESTO DA ERROR PORQUE LAS CLASES ABSTRACTAS NO SE PUEDEN INSTANCIAR
    val square = Square(side = 4.0)
    val circle = Circle(radius = 16.0)
    print(square.side)
    //print(circle.radius) --> Esto da error porque el radios es PRIVADO
    val shapes = listOf(square, circle)
    for (shape in shapes) {
        println(shape.calculateArea())
    }
}