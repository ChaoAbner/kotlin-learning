package demo

/**
 * 空值检测
 */


// 当某个变量的值可以为null的时候，必须在明处的类型后添加？来标识该引用可为空。
// 如果str的内容不是数字则返回null

fun parseInt(str: String): Int? {
    return null
}

// 使用可返回空值的函数
fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // 直接调用x * y报错，因为他们可能为null
    if (x != null && y != null) {
        // 非空检测后，x和y会自动变成非空值
        println(x * y)
    } else {
        println("$arg1 or $arg2 is not a number")
    }
}

fun main() {

}
