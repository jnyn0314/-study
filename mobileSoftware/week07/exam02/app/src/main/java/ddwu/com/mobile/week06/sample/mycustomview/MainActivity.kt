package ddwu.com.mobile.week06.sample.mycustomview

import android.content.DialogInterface
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import ddwu.com.mobile.week06.sample.mycustomview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    var selectedIndex = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.myCustomView.setOnLongClickListener {
            val builder: AlertDialog.Builder = AlertDialog.Builder(this).apply {
                setTitle("색상선택")
                setSingleChoiceItems(
                    R.array.colors,
                    selectedIndex
                ) { dialogInterface: DialogInterface, index: Int
                    ->
                    selectedIndex = index
                }
                setPositiveButton("확인"){
                    dialog : DialogInterface?, which : Int
                        ->
                    val colors = resources.getStringArray(R.array.colors)
                    val selectedColorName = colors[selectedIndex]
                    val selectedColor = when (selectedColorName){
                        "red" -> Color.RED
                        "green" -> Color.GREEN
                        "blue" -> Color.BLUE
                        else -> {Color.RED}
                    }
                    binding.myCustomView.paintColor = selectedColor
                    binding.myCustomView.invalidate()
                    Log.d("MainActivity", "${colors[selectedIndex]}"
                    )
                }
                setNegativeButton(
                    "취소",
                ){ dialog: DialogInterface?, which: Int ->
                    Toast.makeText(this@MainActivity, "취소", Toast.LENGTH_SHORT).show()
                }
                setCancelable(false)
            }
            builder.show()
            true
        }
    }
}