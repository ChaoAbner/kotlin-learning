package demo.test

/**
 * Created by Chao Ye on 2020/11/16
 */
fun main() {

    val a = 1
    println(a ?: "ssss")

}

private fun getInnerStage(): String {
    val schoolStage = 2
    return when (schoolStage) {
        1 -> "vo.primarySchool"
        2 -> "vo.juniorSchool"
        3 -> "vo.seniorSchool"
        else -> "TextbookSchoolStageVo"
    }
}

