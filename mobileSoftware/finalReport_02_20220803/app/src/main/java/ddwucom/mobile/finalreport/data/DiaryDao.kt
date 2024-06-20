package ddwucom.mobile.finalreport.data

import DiaryDBHelper
import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.provider.BaseColumns

class DiaryDao(val context : Context) {

    fun addDiary(newDto : DiaryDto) : Long {
        val helper = DiaryDBHelper(context)
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

    fun updateDiary(newDto: DiaryDto) : Int{
        val helper = DiaryDBHelper(context)
        val db = helper.writableDatabase
        val updateValue = ContentValues()

        updateValue.put(DiaryDBHelper.COL_TITLE, newDto.title)
        updateValue.put(DiaryDBHelper.COL_DATE, newDto.date)
        updateValue.put(DiaryDBHelper.COL_FEELING, newDto.feeling)
        updateValue.put(DiaryDBHelper.COL_TEXT, newDto.text)

        val whereClause = "${BaseColumns._ID}=?"
        val whereArgs = arrayOf(newDto.id.toString())

        val resultCount = db.update(DiaryDBHelper.TABLE_NAME,
            updateValue, whereClause, whereArgs)

        helper.close()
        return resultCount
    }
    @SuppressLint("Range")
    fun getAllDiarys() : ArrayList<DiaryDto>{
        val helper = DiaryDBHelper(context)
        val db = helper.readableDatabase
        val cursor = db.query(DiaryDBHelper.TABLE_NAME, null, null, null, null, null, null)

        val diarys = arrayListOf<DiaryDto>()
        with(cursor){
            while(moveToNext()){
                val id = getInt( getColumnIndex(BaseColumns._ID) )
                val title = getString(getColumnIndex(DiaryDBHelper.COL_TITLE))
                val date = getString(getColumnIndex(DiaryDBHelper.COL_DATE))
                val feeling = getInt(getColumnIndex(DiaryDBHelper.COL_FEELING))
                val text = getString(getColumnIndex(DiaryDBHelper.COL_TEXT))
                val dto = DiaryDto(id, title, date, feeling,text)
                diarys.add(dto)
            }
        }
        cursor.close()
        helper.close()
        return diarys
    }
    fun deleteDiary(dto: DiaryDto): Int {
        val helper = DiaryDBHelper(context)
        val db = helper.writableDatabase

        val whereClause = "${BaseColumns._ID}=?"
        val whereArgs = arrayOf(dto.id.toString())

        val deletedRows = db.delete(DiaryDBHelper.TABLE_NAME, whereClause, whereArgs)

        db.close()
        helper.close()
        return deletedRows
    }
}