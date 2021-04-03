package com.example.kotlinassignment

fun main(args : Array<String>)
{
    println("Enter the quantity")
    val number1 = readLine()!!.toInt()
    println("Enter the unit  price of the sold item")
    val number2 = readLine()!!.toInt()
    val bill =  number1 * number2
    println("the calculated bill amount is $bill ")
    val discountedbill = (bill * 15)/100
    val last = bill-discountedbill

    val text ="""
        The bill you will get 
        1. Quantity= $number1
        2. Unit price of the sold item is = $number2
        3. Calculated bill without discount = $bill
        4. Calculated bill with 15% discount = $discountedbill
        Total money you have to pay = $last
        
    """
    println(text)
}