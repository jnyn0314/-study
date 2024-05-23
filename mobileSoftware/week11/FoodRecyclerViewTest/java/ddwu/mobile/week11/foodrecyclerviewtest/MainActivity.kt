package ddwu.mobile.week11.foodrecyclerviewtest

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import ddwu.mobile.week11.foodrecyclerviewtest.databinding.ActivityMainBinding
import ddwu.mobile.week11.foodrecyclerviewtest.databinding.ListItemBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val foods = FoodDao().foods
        val adapter = FoodAdapter(foods)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter

        val listener = object : FoodAdapter.OnItemClickListener {
            override fun onItemClick(view: View, position: Int) {
                Toast.makeText(this@MainActivity, "{$foods[position]}", Toast.LENGTH_SHORT).show()
                showDialog(foods, position, adapter)
                // foods.removeAt(position)
                // adapter.notifyDataSetChanged()
                true
            }
        }
        adapter.setOnClickListener(listener)

        val longClickListener = object : FoodAdapter.OnItemLongClickListener {
            override fun onItemLongClick(view: View, position: Int) {
                foods.removeAt(position)
                adapter.notifyDataSetChanged()
                true
            }
        }
        adapter.setOnLongClickListener(longClickListener)
    }

    fun showDialog(foods : ArrayList<FoodDto>, position : Int, adapter: FoodAdapter) {
        AlertDialog.Builder(this)
            .setTitle("title")
            .setMessage("지울까요?")
            .setPositiveButton("네", DialogInterface.OnClickListener { dialogInterface, which ->
                Log.d("mytag", "positive")
                foods.removeAt(position)
                adapter.notifyDataSetChanged()
            })
            .setNegativeButton("아니요", DialogInterface.OnClickListener{ dialog: DialogInterface?, which: Int ->
                Log.d("mytag", "negative")
                adapter.notifyDataSetChanged()
            })
            .create()
            .show()
    }
}