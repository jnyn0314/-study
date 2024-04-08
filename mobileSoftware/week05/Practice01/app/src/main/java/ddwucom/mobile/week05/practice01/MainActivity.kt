package ddwucom.mobile.week05.practice01

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ddwucom.mobile.week05.practice01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        // val myView = MyView(this)
        // val myView = MyOuterView(this)
        // setContentView(myView)

        val binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            binding.myOuterView.color = Color.RED
            binding.myOuterView.invalidate()
        }
    }
    /*
    class MyView(context : Context?) : View(context){
        // class MyView constructor (context : Context?) : View(context) // constructor 생략
        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)
            canvas?.drawColor(Color.LTGRAY)
            val paint = Paint()
            paint.setColor(Color.BLUE)
            canvas?.drawCircle(200.toFloat(), 200.toFloat(), 100.toFloat(), paint)
        }
    }
    */

}