package ddwucom.mobile.finalreport.data

import android.content.ContentValues
import android.content.Context

class DiaryDao(val context : Context) {
    val helper = DiaryDBHelper(context)

    fun addDiary(newDto : DiaryDto) : Long{
        val db = helper.writableDatabase

        val newValue = ContentValues()
        newValue.put(DiaryDBHelper.COL_TITLE, newDto.title)
        newValue.put(DiaryDBHelper.COL_DATE, newDto.date)
        newValue.put(DiaryDBHelper.COL_FEELING, newDto.feeling)
        newValue.put(DiaryDBHelper.COL_TEXT, newDto.text)

        val newCount = db.insert(DiaryDBHelper.TABLE_NAME, null, newValue)

        helper.close()

        return newCount
    }
}