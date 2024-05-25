package ddwucom.mobile.week12.activitytest

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ddwucom.mobile.week12.activitytest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    val DETAIL_ACTIVITY_CODE = 100
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            // intent.putExtra("subject", "mobile Software")
            // val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:02-123-2334"))
            val dto = FoodDto(R.mipmap.ic_launcher, "치킨", 10)
            intent.putExtra("food", dto)

            startActivityForResult(intent, DETAIL_ACTIVITY_CODE)

            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        // 결과를 요청하고 나서, 내가 결과를 받을 때
        // request code -> activity를 아까 뭘 띄웠는지. code값
        if(requestCode == DETAIL_ACTIVITY_CODE){
            when(resultCode){
                RESULT_OK ->{
                    val result = data?.getStringExtra("result_data")
                    Log.d(TAG, result!!) // 값이 없을 수도 있으니까 !!
                }
                RESULT_CANCELED ->{
                }
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}