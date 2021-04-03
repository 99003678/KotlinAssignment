package com.example.kotlinassignment

import java.util.*

class facto()
{
    fun fact(v:Int):Int
    {
        if(v==1||v==0)
        {
            return 1;
        }
        else
            return v*fact(v-1)
    }
}
fun main()
{
    println("Enter number")
    var sc= Scanner(System.`in`)
    var v=sc.nextInt()
    var res=facto().fact(v)
    print(res)

}
