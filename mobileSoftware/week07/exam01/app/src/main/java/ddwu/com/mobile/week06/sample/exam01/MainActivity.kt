package ddwu.com.mobile.week06.sample.exam01

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ddwu.com.mobile.week06.sample.exam01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val mainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        mainBinding.btnOutput.setOnClickListener{
            val content = mainBinding.etInput.text

            val builder : AlertDialog.Builder = AlertDialog.Builder(this).apply{
                setTitle("입력확인")
                setMessage("$content 를 입력하시겠습니까?")
                setPositiveButton("예", {
                    dialog : DialogInterface?, which : Int ->
                    mainBinding.tvDisplay.text = content
                    Toast.makeText(this@MainActivity, "happy", Toast.LENGTH_SHORT).show()
                })
                setNegativeButton("아니오", null) // 아니오 를 누를 경우 다이얼로그 닫힘 =>?
                setCancelable(false)
            }
            builder.show()
        }
    }
}