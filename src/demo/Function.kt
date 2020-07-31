package demo

/**
 * 函数
 */

// 两个int参数，int返回值
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 表达式作为函数体，自动识别返回值
fun sum1(a: Int, b: Int) = a + b

// 无意义的返回值，可以理解为void
fun sum2(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// Unit返回值可以省略
fun sum3(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun main() {
    val a = 1
    val b = 2
    println(sum(a, b))
    println(sum1(a, b))
    sum2(a, b)
    sum3(a, b)
}
