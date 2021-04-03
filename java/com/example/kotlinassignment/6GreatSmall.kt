package com.example.kotlinassignment

val anonymous2 = fun(a: Array<Int>): Int {
    var min:Int=a[0];
    var largest:Int=a[0]
    for (num in a) {
        if (largest < num)
            largest = num
    }
    for (num in a) {
        if (min > num)
            min = num
    }
    println("smallest")
    println(min)
    println("largest")
    println(largest)
    return 1;

}
fun main(args:Array<String>){
    val a = arrayOf(1, 2, 3, 4, 5,2)

    anonymous2(a)
}