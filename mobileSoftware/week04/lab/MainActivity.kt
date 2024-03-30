package ddwucom.mobile.week03.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val textView : TextView = findViewById(R.id.myText)
        // val textView = findViewById<TextView>(R.id.myText) // 다운캐스팅
        textView.setText("HI") // text는 객체 -> getter, setter 호출한 것
    }

    // 버튼 눌렀을 때 동작하는 함수 -> 반드시 매개변수에 view 타입 객체
    fun onClick (view : View) {
        Toast.makeText(this, "버튼을 클릭함", Toast.LENGTH_SHORT).show()

        val myEdit : EditText = findViewById(R.id.myEdit)

            val text = myEdit.text // 코틀린에서는 getter대신 바로 객체 써도 값 가져올 수 있음
            val textView : TextView = findViewById(R.id.myText)
            textView.text = myEdit.text // setter - 문자열을 읽을 땐 setter 써줘야 해. 단순 값 대입은 생략 가능
    }
}