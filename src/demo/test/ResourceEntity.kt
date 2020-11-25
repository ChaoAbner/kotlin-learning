package demo.test

import java.time.LocalDateTime

/**
 * Created by Chao Ye on 2020/11/16
 */
data class ResourceEntity (

        var id: String? = null,

        var uid: String? = null,

        var resourceName: String? = null,

        var resourceType: Int? = null,

        var textbookVersionUid: String? = null,

        var operatorUid: String? = null,

        var isDeleted: Boolean? = null,

        var isStick: Boolean? = null,

        var createTime: LocalDateTime? = null,

        var updateTime: LocalDateTime? = null
) {
    companion object {
        fun of(resourceName: String, resourceType: Int, textbookVersionUid: String,
               operatorUid: String, uid: String): ResourceEntity {
            return ResourceEntity().apply {
                this.uid = uid
                this.resourceName = resourceName
                this.resourceType = resourceType
                this.textbookVersionUid = textbookVersionUid
                this.operatorUid = operatorUid
                this.createTime = LocalDateTime.now()
                this.updateTime = LocalDateTime.now()
                this.isDeleted = false
                this.isStick = false
            }
        }
    }
}