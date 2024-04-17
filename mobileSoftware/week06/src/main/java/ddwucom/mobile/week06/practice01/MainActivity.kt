package ddwucom.mobile.week06.practice01

import android.app.Activity
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

        // 3. SAM
        mainBinding.btnOutput.setOnClickListener{
            val myEdit : EditText = mainBinding.etInput
            val myTextView : TextView = mainBinding.tvDisplay

            myTextView.text = myEdit.text
        }

        /*
        // 2. object 객체 생성
        val myClick = object : View.OnClickListener{
            override fun onClick(view : View?){
                val myEdit : EditText = mainBinding.etInput

                val myTextView : TextView = mainBinding.tvDisplay
                myTextView.text = myEdit.text
            }
        }

        mainBinding.btnOutput.setOnClickListener(myClick)
        */


        /* 1. 리스너 인터페이스 작성
        val myClick = MyClick(this)
        mainBinding.btnOutput.setOnClickListener(myClick) */

    }

    // 1. 리스너 인터페이스 작성
    /*
    class MyClick(val activity: MainActivity) : View.OnClickListener{
        override fun onClick(v: View?) {
            // textView에 출력해라.
            val myEdit : EditText = activity.mainBinding.etInput

            val textView : TextView = activity.mainBinding.tvDisplay
            textView.text = myEdit.text // 값 읽어서 text에 출력
        }
    }
    */
}
