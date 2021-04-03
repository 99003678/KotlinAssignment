package com.example.kotlinassignment

import java.util.*

fun main(args: Array<String>) {
    var n:Int;
    val reader = Scanner(System.`in`)
    println("enter number")
    n = reader.nextInt()
    var i=2;
    while(n>0){
        if(isPrime(i)) {
            print(i)
            print("\t")
            n--;
            i++
        }
        else{
            i++
        }
    }
}
fun isPrime(i:Int):Boolean
{
    var count=0;

    for(j in 1..i){
        if(i%j==0){
            count++
        }
    }
    if(count>2)
    {
        return false
    }
    else
    {
        return true
    }
}