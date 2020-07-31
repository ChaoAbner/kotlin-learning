package demo

/**
 * 集合
 */

val list = listOf("apple", "banana", "orange", "aaaa")

// 对集合进行迭代
fun collection1() {
    for (i in list) {
        println(i)
    }
}

// 使用in来判断集合内是否存在某个元素
fun collection2() {
    if ("apple" in list) {
        println("apple in list")
    }
}

// 使用lambda表达式来过滤与映射集合
fun collection3() {
    list.filter { it.startsWith("a") }.sortedBy { it }.map { it.toUpperCase() }.forEach { println(it) }
}

fun main() {
    collection1()
    collection2()
    collection3()
}
