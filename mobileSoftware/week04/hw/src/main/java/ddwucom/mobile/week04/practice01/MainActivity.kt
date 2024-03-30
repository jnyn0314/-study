package ddwucom.mobile.week04.practice01

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
    }

    fun clickHello(view : View) {
        val editName = findViewById<EditText>(R.id.etName)
        val editPhone = findViewById<EditText>(R.id.etPhone)

        val name = editName.text.toString()
        val phone = editPhone.text.toString()

        Toast.makeText(
            this, "안녕하세요, 저는 $name 입니다. " +
                    "전화번호는 $phone 입니다.", Toast.LENGTH_LONG
        ).show()
    }
    fun clickFinish(view : View){
        finish()
    }
}