package demo

/**
 * 类型检测和类型转换
 */

fun getStringLength1(obj: Any): Int? {
    if (obj is String) {
        // 如果是String类型，自动转成String
        return obj.length
    }
    // 跳出判断代码块，则还是Any
    return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj !is String) {
        return null
    }
    // 自动转成String
    return obj.length
}

fun getStringLength3(obj: Any): Int? {
    // 在&&的右边，obj转成String
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}


fun main() {

}
