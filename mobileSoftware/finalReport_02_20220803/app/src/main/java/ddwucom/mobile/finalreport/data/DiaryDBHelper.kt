package ddwucom.mobile.finalreport.data

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns
import android.util.Log

class DiaryDBHelper(context : Context?) : SQLiteOpenHelper(context, DB_NAME, null, 1 ){

    val TAG = "DiaryDBHelper"

    companion object{
        const val DB_NAME= "diary_db"
        const val TABLE_NAME = "diary_table"
        const val COL_TITLE = "diary"
        const val COL_DATE = "date"
        const val COL_FEELING = "feeling"
        const val COL_TEXT = "text"
        const val COL_IMG = "image"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME (${BaseColumns._ID} " +
                "INTEGER PRIMARY KEY AUTOINCREMENT," +
                "$COL_TITLE TEXT, $COL_DATE TEXT," +
                "$COL_FEELING TEXT, $COL_TEXT TEXT," +
                "$COL_IMG TEXT)"
        Log.d(TAG, CREATE_TABLE)
        db?.execSQL(CREATE_TABLE)
    }
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        val DROP_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
        db?.execSQL(DROP_TABLE)
        onCreate(db)
    }
}