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

    lateinit var helper: FoodDBHelper

    @SuppressLint("Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        helper = FoodDBHelper(this) // FoodDBHelper 호출되면서, DB 파일이 만들어진다.
        val db = helper.readableDatabase // helper에 writeable이나 readable이 최초 호출되는 순간
        // onCreate가 호출된다. ->  table이 만들어진다.

        binding.btnSelect.setOnClickListener {
            val foodList = showFoods()

            var data = ""
            for(food in foodList){
                data += food.toString() + "\n";
            }
            binding.tvDisplay.text = data
        }
        binding.btnAdd.setOnClickListener {
            val intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
            // addFood("된장찌개", "한국")
        }

        binding.btnUpdate.setOnClickListener {
            modifyFood()
        }
        binding.btnRemove.setOnClickListener {
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
        val updateow = ContentValues()
        updateow.put(FoodDBHelper.COL_COUNTRY, "한국")
        val whereClause = "${FoodDBHelper.COL_FOOD}=?"
        val whereArgs = arrayOf("된장찌개")
        db.update(FoodDBHelper.TABLE_NAME, updateow, whereClause, whereArgs)
        helper.close()
    }

    fun deleteFood() {
        val db = helper.writableDatabase
        val whereClause = "food=?"
        val whereArgs = arrayOf("된장찌개")
        db.delete("food_table", whereClause, whereArgs)
        helper.close()
    }

    @SuppressLint("Range")
    fun showFoods() : List<FoodDto>{
        val db = helper.readableDatabase
        val colums = null
        // val selection = "food=?"
        val selection = "${FoodDBHelper.COL_FOOD}=?"
        val selectionArgs = arrayOf("된장찌개")
        val cursor = db.query(
            "food_table", colums, selection, selectionArgs,
            null, null, null, null
        )
        val foodList = arrayListOf<FoodDto>()
        with(cursor) {
            while (moveToNext()) {
                val id = getInt(getColumnIndex(BaseColumns._ID))
                val food = getString(getColumnIndex(FoodDBHelper.COL_FOOD))
                val country = getString(getColumnIndex(FoodDBHelper.COL_COUNTRY)) // 세 줄이 하나의 레코드를 의미
                Log.d(TAG, "$id - $food ( $country) ")
                val dto = FoodDto(id, food, country)
                foodList.add(dto)
            }
        }
        cursor.close()
        helper.close()
        return foodList
    }
}

