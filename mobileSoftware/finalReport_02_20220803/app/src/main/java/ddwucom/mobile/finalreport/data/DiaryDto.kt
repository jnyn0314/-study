package ddwucom.mobile.finalreport.data

import java.io.Serializable

class DiaryDto(val id : Long, var image : Int, var title : String, var date : String, var feeling : String, var text : String) : Serializable {
    override fun toString() = "$id ( $image - $title - $date - $feeling - $text)"
}