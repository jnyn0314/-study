package ddwu.com.mobile.fooddbexam

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.BaseColumns
import android.util.Log
import ddwu.com.mobile.fooddbexam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    lateinit var helper : FoodDBHelper

    @SuppressLint("Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        helper = FoodDBHelper(this)

        binding.btnSelect.setOnClickListener{
            val foodList = showFoods()
        }

        binding.btnAdd.setOnClickListener{
            addFood("된장찌개", "한국")
        }

        binding.btnUpdate.setOnClickListener{
            modifyFood()
        }

        binding.btnRemove.setOnClickListener{
            deleteFood()
        }
    }

    fun addFood(food : String, country : String) {
        val db = helper.writableDatabase
        val newRow = ContentValues()
        newRow.put(FoodDBHelper.COL_FOOD, food)
        newRow.put(FoodDBHelper.COL_COUNTRY, country)
        db.insert(FoodDBHelper.TABLE_NAME, null, newRow)
        helper.close()
    }

    fun modifyFood() {
        val db = helper.writableDatabase
        val updateRow = ContentValues()
        updateRow.put(FoodDBHelper.COL_FOOD, "한국")
        val whereClause = "${FoodDBHelper.COL_COUNTRY}=?"
        val whereArgs = arrayOf("한국")
        db.update(FoodDBHelper.TABLE_NAME, updateRow, whereClause, whereArgs)
        helper.close()
    }

    fun deleteFood() {
        val db = helper.writableDatabase
        val whereClause = "${FoodDBHelper.COL_FOOD}=?"
        val whereArgs = arrayOf("된장찌개")
        db.delete(FoodDBHelper.TABLE_NAME, whereClause, whereArgs)
        helper.close()
    }

    @SuppressLint("Range")
    fun showFoods() : List<FoodDto>{
        val db = helper.readableDatabase
        val selection = "${FoodDBHelper.COL_FOOD}=?"
        val selectionArgs = arrayOf("된장")
        val cursor = db.query(FoodDBHelper.TABLE_NAME, null, selection, selectionArgs, null, null, null, null)

        val array = ArrayList<FoodDto>();

        with(cursor){
            while(moveToNext()){
                val id = getInt(getColumnIndex(BaseColumns._ID))
                val food = getString(getColumnIndex(FoodDBHelper.COL_FOOD))
                val country = getString(getColumnIndex(FoodDBHelper.COL_COUNTRY))

                val dto = FoodDto(id, food, country)
                array.add(dto)
            }
        }
        cursor.close()
        helper.close()
        return array
    }
}
