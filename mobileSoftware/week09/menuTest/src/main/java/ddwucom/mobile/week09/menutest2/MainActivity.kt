package ddwucom.mobile.week09.menutest2

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import ddwucom.mobile.week09.menutest2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    val contextSelected

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        registerForContextMenu(binding.tvText)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?, // 왜 뷰가 매개변수로? -> 어떤 걸 lonclick했는지 알기 위해서
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        when(v?.id){ // view가 여러개일 때. 지금은 하나니까 그냥.
            R.id.tvText -> {

                menuInflater.inflate(R.menu.menu_main, menu)

            }
        }

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.subItem01 -> {
                Toast.makeText(this, "context01", Toast.LENGTH_SHORT).show()
            }
            R.id.subItem02 -> {
                Toast.makeText(this, "context02", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.subItem01 -> {
                Toast.makeText(this, "subItem01", Toast.LENGTH_SHORT).show()
            }
            R.id.subItem02 -> {
                Toast.makeText(this, "subItem02", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
    fun onMenuItemClick(item : MenuItem){
        when(item.itemId){
            R.id.subItem01 -> {
                Toast.makeText(this, "subItem01", Toast.LENGTH_SHORT).show()
            }
            R.id.subItem02 -> {
                Toast.makeText(this, "subItem02", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
