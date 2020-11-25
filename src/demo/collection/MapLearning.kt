package demo.collection

/**
 * Created by Chao Ye on 2020/11/14
 */

var map1 = mapOf("one" to listOf(1, 2, 3), "two" to 2)

fun func1() {
    val map = map1.filter { it.value == 2 }
    println(map)
}

fun func2() {
    map1.forEach { t, u -> println("$t: $u") }
}



fun main() {
    func1()
    func2()
}