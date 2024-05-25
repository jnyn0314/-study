package ddwucom.mobile.week12.activitytest

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ddwucom.mobile.week12.activitytest.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    val detailBinding by lazy{
        ActivityDetailBinding.inflate(layoutInflater)
    }
    val TAG = "DetailActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(detailBinding.root)

        val data = intent.getSerializableExtra("food")
        Log.d(TAG, "food: $data")

        detailBinding.btDetail.setOnClickListener{
            val resultIntent = Intent()
            resultIntent.putExtra("result_data", "Detail Result")
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}