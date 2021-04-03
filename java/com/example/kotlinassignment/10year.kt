package com.example.kotlinassignment

fun main()
{
    println("Enter the year")
    var year=Integer.valueOf(readLine())

    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
    {
        println("This is a leap year")
    }
    else
    {
        print("this is not a leap year")
    }
}
