package com.example.kotlinassignment

import java.util.*

fun main()
{
    val sc=Scanner(System.`in`)
    println("enter two numbers")
    var a=sc.nextInt()
    var b=sc.nextInt()
 var d=0

    println("Press 1 for addition")
    println("Press 2 for substraction")
    println("Press 3 for multiplication")
    println("Press 4 for division")
    var c=sc.nextInt()

    if(c==1)
    {
        d=a+b
    }
    else if(c==2)
    {
      d=a-b
    }
   else if(c==3)
    {
        d=a*b
    }
   else if(c==4)
    {
        d=a/b
    }

    else{
        println("Invalid Input")
    }
    println("Result is $d")
}