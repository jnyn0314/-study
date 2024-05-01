package ddwucom.mobile.week07.dialogtest

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import ddwucom.mobile.week07.dialogtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val mainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        mainBinding.button.setOnClickListener{

            val ononClick = object : DialogInterface.OnClickListener{
                // 인터페이스
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    Toast.makeText(this@MainActivity, "확인", Toast.LENGTH_SHORT).show()
                }
            }
            // {매개변수 -> 실행부분} // 매개변수 2개니까 람다함수로
            // {
               //     dialog: DialogInterface?, which: Int -> Toast.makeText(this@MainActivity, "확인", Toast.LENGTH_SHORT).show()
            // }


            val builder : AlertDialog.Builder = AlertDialog.Builder(this).apply{
                setTitle("대화상자 제목")
                setMessage("대화상자 메세지")
                setIcon(R.mipmap.ic_launcher_round)
                setPositiveButton("확인", ononClick)
                setNeutralButton("대기", null)
                setNegativeButton("취소", { dialog: DialogInterface?, which: Int
                    -> Toast.makeText(this@MainActivity, "확인", Toast.LENGTH_SHORT).show()
                })
                setCancelable(false)
            }
            builder.show()
        }
    }
}