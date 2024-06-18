package ddwucom.mobile.finalreport

import android.content.ContentValues
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ddwucom.mobile.finalreport.data.DiaryDBHelper
import ddwucom.mobile.finalreport.data.DiaryDao
import ddwucom.mobile.finalreport.data.DiaryDto
import ddwucom.mobile.finalreport.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {
    val addBinding by lazy{
        ActivityAddBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(addBinding.root)

        // edit text에서 값을 읽어와서 데이터베이스에 저장한다.
        addBinding.btAdd.setOnClickListener{
            // 이 때 만약에 받은 값이 null이라면, toast 출력한다.
            val title = addBinding.etInputTitle.text.toString()
            val date = addBinding.etInputDate.text.toString()
            val feeling = addBinding.etInputFeeling.text.toString()
            val text = addBinding.etInputText.text.toString()

            if(title.equals("이름을 입력하세요.") || title.equals("")){
                Toast.makeText(this, "이름을 입력하세요.", Toast.LENGTH_SHORT).show()
            }
            else if(date.equals("날짜를 입력하세요.") || date.equals("")){
                Toast.makeText(this, "날짜를 입력하세요.", Toast.LENGTH_SHORT).show()
            }
            else if(feeling.equals("오늘의 기분을 입력하세요.") || feeling.equals("")){
                Toast.makeText(this, "오늘의 기분을 입력하세요.", Toast.LENGTH_SHORT).show()
            }
            else if(text.equals("오늘 있었던 일을 입력하세요.") || text.equals("")){
                Toast.makeText(this, "오늘 있었던 일을 입력하세요.", Toast.LENGTH_SHORT).show()
            }
            else{
                if(DiaryDao(this).addDiary( DiaryDto(0, 0, title, date, feeling, text)) > 0) {
                    setResult(RESULT_OK)
                }else{
                    setResult(RESULT_CANCELED)
                }
                finish()
            }
        }
        addBinding.btCancel.setOnClickListener{
            setResult(RESULT_CANCELED)
            finish()
        }
    }
}