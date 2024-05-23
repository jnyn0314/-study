package ddwucom.mobile.week11.recyclerviewtest

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import ddwucom.mobile.week11.recyclerviewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    val dao = SubjectDao()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dataList = dao.dataList

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recyclerView.layoutManager = layoutManager

        val adapter = MyAdapter(this, R.layout.list_item, dataList)
        binding.recyclerView.adapter = adapter

        binding.button.setOnClickListener{
            val subject = binding.etText.text.toString()
            dataList.add(subject)
            adapter.notifyDataSetChanged()
        }
    }
}
