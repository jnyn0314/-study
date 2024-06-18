// 과제명 : 다이어리 관리 앱
// 분반 : 02분반
// 학번 20220803 이름 : 정여진
// 제출일 : 2024-06-25

package ddwucom.mobile.finalreport

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ddwucom.mobile.finalreport.data.DiaryDao
import ddwucom.mobile.finalreport.data.SimpleDiaryDao
import ddwucom.mobile.finalreport.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val REQ_ADD = 100

    val mainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    var selected = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        val diary = SimpleDiaryDao().diaryLists
        val adapter = DiaryAdapter(diary)
        mainBinding.recyclerView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        mainBinding.recyclerView.layoutManager = layoutManager
        mainBinding.recyclerView.adapter = adapter
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // 빈 메뉴가 들어옴. => 나중에 inflate해서 menu 붙여줌
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onPrepareOptionsMenu(menu : Menu?) : Boolean{
        when(selected){
            0 ->{
                menu?.findItem(R.id.itemAddDiary)?.setChecked(true)
            }
            1 ->{
                menu?.findItem(R.id.ItemDeveloper)?.setChecked(true)
            }
            2 ->{
                menu?.findItem(R.id.ItemFinish)?.setChecked(true)
            }
        }

        return true
    }
    override fun onOptionsItemSelected(item : MenuItem) : Boolean{ // 선택한 동작 기록
        when(item.itemId){
            R.id.itemAddDiary ->{
                val intent = Intent(this@MainActivity, AddActivity::class.java)
                startActivityForResult(intent, REQ_ADD)
                selected = 0
            }
            R.id.ItemDeveloper ->{
                Toast.makeText(this, "02", Toast.LENGTH_SHORT).show()
                selected = 1
            }
            R.id.ItemFinish ->{
                Toast.makeText(this, "03", Toast.LENGTH_SHORT).show()
                selected = 2
            }
        }
        return true
    }

}