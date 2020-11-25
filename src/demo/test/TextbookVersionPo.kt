package demo.test

import java.util.*
import javax.xml.soap.Text

/**
 * Created by Chao Ye on 2020/11/16
 */
data class TextbookVersionPo (
        var uid: String? = null,

        var textbookVersionName: String? = null,

        var schoolStage: String? = null
) {
    companion object {
        fun of(uid: String, textbookVersionName: String, schoolStage: String?): TextbookVersionPo {
            return TextbookVersionPo().apply {
                this.uid = uid
                this.textbookVersionName = textbookVersionName
                this.schoolStage = schoolStage
            }
        }
    }
}



