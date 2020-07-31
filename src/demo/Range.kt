package demo

/**
 * 区间
 */

// 数字是否在某个区间内
fun range1() {
    val x = 5
    val y = 10
    if (x in 1..y) {
        println("x 在1-$y 的范围内")
    }
    if (x !in 6..y) {
        println("x 不在6-$y 的范围内")
    }
}

// 区间迭代
fun range2() {
    for (x in 1..5) {
        println(x)
    }
}

// 数列迭代、跨步迭代
fun range3() {
    for (x in 1..10 step 2) {
        println(x)
    }
}

fun main() {
    range1()
    range2()
    range3()
}
