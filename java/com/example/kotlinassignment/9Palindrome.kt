package com.example.kotlinassignment

import java.util.*


fun Palin(n: Long): Boolean {
    var PNumber = false
    var sum : Long= 0
    var temp = n

    while (temp > 0) {
        val r = temp % 10
        sum = sum * 10 + r
        temp /= 10
    }
    if (sum == n) {
        PNumber = true
    }
    return PNumber
}


fun main(arg: Array<String>) {

    val sc = Scanner(System.`in`)
    println("Enter the number till you want pallindrome")
    val number: Long = sc.nextLong()

    val list: MutableList<Long> = ArrayList()

    for (i in 0..number) {
        if (Palin(i)) {
            list.add(i)
        }
    }

    println("Palindrome Numbers from 0 to $number  are : $list")
}