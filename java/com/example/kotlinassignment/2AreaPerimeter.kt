package com.example.kotlinassignment

import java.util.*

fun main(args:Array<String>){
    val reader = Scanner(System.`in`)
    println("enter radius")
    var radius:Double = reader.nextDouble()
    println("area is:")
    println(calcRad(radius))
    println("perimeter is")
    println(calcPerimeter(radius))
    println("Length of the square is")
    println(calclen(radius))
}

fun calcRad(radius:Double):Double{
    return (3.14*radius*radius)
}

fun calcPerimeter(radius:Double):Double{
    return (3.14*radius*2)
}

fun calclen(radius:Double):Double{
    val peri:Double
    peri=3.14*radius*2
    val len:Double;
    len=peri/4;

    return (len)
}