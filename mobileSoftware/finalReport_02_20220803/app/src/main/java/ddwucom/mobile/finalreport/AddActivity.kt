package ddwucom.mobile.finalreport

import android.content.ContentValues
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ddwucom.mobile.finalreport.data.DiaryDao
import ddwucom.mobile.finalreport.data.DiaryDto
import ddwucom.mobile.finalreport.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {
    val addBinding by lazy {
        ActivityAddBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(addBinding.root)

        addBinding.btAdd.setOnClickListener {
            val title = addBinding.etInputTitle.text.toString()
            val date = addBinding.etInputDate.text.toString()
            val feeling = addBinding.rgAddFeeling.checkedRadioButtonId
            val text = addBinding.etInputText.text.toString()

            if (title.equals("제목을 입력하세요.") || date.equals("날짜를 입력하세요.") || feeling.equals("오늘의 기분을 입력하세요.") || text.equals("오늘 있었던 일을 입력하세요.")) {
                Toast.makeText(this, "모든 필드를 입력하세요.", Toast.LENGTH_SHORT).show()
            } else {
                val dao = DiaryDao(this)
                if (dao.addDiary(DiaryDto(0, title, date, feeling, text)) > 0) {
                    setResult(RESULT_OK)
                } else {
                    setResult(RESULT_CANCELED)
                }
                finish()
            }
        }
        addBinding.btCancel.setOnClickListener {
            setResult(RESULT_CANCELED)
            finish()
        }
    }
}
