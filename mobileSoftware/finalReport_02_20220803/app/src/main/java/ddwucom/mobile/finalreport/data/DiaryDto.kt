package ddwucom.mobile.finalreport.data

import java.io.Serializable

data class DiaryDto(val id : Int, var title : String, var date : String, var feeling : Int, var text : String) : Serializable {
    override fun toString() = "$id ($title - $date - $feeling - $text)"
}
