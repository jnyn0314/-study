package ddwucom.mobile.week05.layouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import ddwucom.mobile.week05.layouttest.databinding.LinearLayoutBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : LinearLayoutBinding =
            LinearLayoutBinding.inflate(layoutInflater) // 여기서 객체 만들어짐

        // setContentView(R.layout.linear_layout) // 할 필요 없어 xml 파일 직접 만들어서 객체 만들고, 화면에 직접 배치
        setContentView(binding.root) // 이제 배치하는 역할만 하면 돼. setContentView에 넣어주긴 해야돼.
        // binding 장점 : findViewById 더이상 쓸 필요 없어

        // val button = findViewById<Button>(R.id.button1)

        binding.button1.setOnClickListener{
            binding.linear.orientation = LinearLayout.VERTICAL
        }

        /*
        button.setOnClickListener {
            val layout : LinearLayout = findViewById(R.id.linear)
            layout.orientation = LinearLayout.VERTICAL
        }

         */
    }


}