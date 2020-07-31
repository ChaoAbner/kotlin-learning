package demo

/**
 * 循环
 */

val items = listOf("apple", "banana", "kiwifruit")

fun circle1(items: List<String>) {
    for (item in items) {
        println(item)
    }
}

fun circle2(items: List<String>) {
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun circle3(items: List<String>) {
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index++]}")
    }
}

fun main() {
    circle1(items)
    circle2(items)
    circle3(items)
}
