package ddwucom.mobile.finalreport

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ddwucom.mobile.finalreport.data.DiaryDao
import ddwucom.mobile.finalreport.data.DiaryDto
import ddwucom.mobile.finalreport.databinding.ActivityUpdateBinding

class UpdateActivity : AppCompatActivity() {

    val updateBinding by lazy {
        ActivityUpdateBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(updateBinding.root)

        val dto = intent.getSerializableExtra("dto") as DiaryDto

        updateBinding.etUpdateId.setText(dto.id.toString())
        updateBinding.etUpdateTitle.setText(dto.title)
        updateBinding.etUpdateDate.setText(dto.date)
        updateBinding.etUpdateText.setText(dto.text)

        when (dto.feeling) {
            R.id.radioButton1 -> updateBinding.rgUpdateFeeling.check(R.id.radioButton1)
            R.id.radioButton2 -> updateBinding.rgUpdateFeeling.check(R.id.radioButton2)
            R.id.radioButton3 -> updateBinding.rgUpdateFeeling.check(R.id.radioButton3)
            R.id.radioButton4 -> updateBinding.rgUpdateFeeling.check(R.id.radioButton4)
            R.id.radioButton5 -> updateBinding.rgUpdateFeeling.check(R.id.radioButton5)
            R.id.radioButton6 -> updateBinding.rgUpdateFeeling.check(R.id.radioButton6)
        }

        updateBinding.btUpdate.setOnClickListener {
            dto.title = updateBinding.etUpdateTitle.text.toString()
            dto.date = updateBinding.etUpdateDate.text.toString()
            dto.text = updateBinding.etUpdateText.text.toString()

            updateBinding.rgUpdateFeeling.setOnCheckedChangeListener { group, checkedId ->
                dto.feeling = checkedId
            }

            if (DiaryDao(this).updateDiary(dto) > 0) {
                setResult(RESULT_OK)
            } else {
                setResult(RESULT_CANCELED)
            }
            finish()
        }

        updateBinding.btUpdateCancel.setOnClickListener {
            setResult(RESULT_CANCELED)
            finish()
        }
    }
}
