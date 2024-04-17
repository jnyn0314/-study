package ddwucom.mobile.week06.practice01

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import ddwucom.mobile.week06.practice01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val mainBinding : ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)
    }

    class MyClick(context: Context) : View.OnClickListener{
        override fun onClick(v: View?) {
            // textView에 출력해라.
            val myEdit : EditText = mainBinding.etInput
            val text = myEdit.text

            val textView : TextView = mainBinding.tvDisplay
            textView.text = myEdit.text
        }
    }
}