// 과제명 : 다이어리 관리 앱
// 분반 : 02분반
// 학번 20220803 이름 : 정여진
// 제출일 : 2024-06-25

package ddwucom.mobile.finalreport

import DiaryAdapter
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ddwucom.mobile.finalreport.data.DiaryDao
import ddwucom.mobile.finalreport.data.DiaryDto
import ddwucom.mobile.finalreport.data.SimpleDiaryDao
import ddwucom.mobile.finalreport.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val REQ_ADD = 100
    val REQ_UPDATE = 200

    val mainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    val diaryDao by lazy{
        DiaryDao(this)
    }
    lateinit var diaries : ArrayList<DiaryDto>

    var selected = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        diaries = diaryDao.getAllDiarys()

        val adapter = DiaryAdapter(diaries)
        mainBinding.recyclerView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        mainBinding.recyclerView.layoutManager = layoutManager

        adapter.setOnItemClickListener(object : DiaryAdapter.OnItemClickListener {
            override fun onItemClick(view: View, position: Int) {
                val selectedDiary = diaries[position]
                val intent = Intent(this@MainActivity, UpdateActivity::class.java)
                intent.putExtra("dto", selectedDiary)
                startActivityForResult(intent, REQ_UPDATE)
            }
        })

        adapter.setOnItemLongClickListener(object : DiaryAdapter.OnItemLongClickListener {
            override fun onItemLongClick(view: View, position: Int): Boolean {
                val selectedDiary = diaries[position]

                val builder = AlertDialog.Builder(view.context)
                builder.setTitle("일기 삭제")
                    .setMessage("${selectedDiary.title}를 지우시겠습니까?")
                    .setPositiveButton("삭제") { dialog, which ->
                        if (diaryDao.deleteDiary(selectedDiary) > 0) {
                            diaries.removeAt(position)
                            mainBinding.recyclerView.adapter?.notifyItemRemoved(position)
                        } else {
                            Toast.makeText(view.context, "삭제 실패", Toast.LENGTH_SHORT).show()
                        }
                    }
                    .setNegativeButton("취소") { dialog, which ->
                        dialog.dismiss()
                    }
                    .setCancelable(false)
                    .show()

                return true
            }
        })
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
                val intent = Intent(this@MainActivity, IntroActivity::class.java)
                startActivity(intent)
                selected = 1
            }
            R.id.ItemFinish ->{
                finish()
                selected = 2
            }
        }
        return true
    }
    override fun onActivityResult(requestCode : Int, resultCode : Int, data : Intent?){
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            REQ_UPDATE -> {
                if(resultCode == RESULT_OK){
                    diaries.clear()
                    diaries.addAll(diaryDao.getAllDiarys())
                    mainBinding.recyclerView.adapter?.notifyDataSetChanged()
                }
            }
            REQ_ADD ->{
                if(resultCode == RESULT_OK){
                    diaries.clear()
                    diaries.addAll(diaryDao.getAllDiarys())
                    mainBinding.recyclerView.adapter?.notifyDataSetChanged()
                }
            }
        }
    }

}