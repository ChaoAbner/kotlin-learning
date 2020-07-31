package demo

/**
 * 变量
 */

// 定义只读的局部变量使用val来定义。只能赋值一次
val a: Int = 1  // 立即赋值

val b = 2       // 自动推测类型

//val c: Int      // 单行会报错

fun a() {
    val c: Int
    c = 3
}

// 可重新赋值的变量使用var关键字
fun b() {
    var x = 5
    x = 2
    x += 1

    // 使用val后续更改变量会报错
//    val y = 1
//    y += 1
}


// 顶层变量
val PI = 3.14
var x = 0

fun c() {
    x += 1
//    PI += 1   // 此行报错，val不可变
}
