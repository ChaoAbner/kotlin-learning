package demo

/**
 * 字符串模板
 */

var c = 1

val s1 = "c is $c"

fun main() {
    println(s1)
    c = 2
    val s2 = "${s1.replace("is", "was")}, but now is $c"
    println(s2)
}
