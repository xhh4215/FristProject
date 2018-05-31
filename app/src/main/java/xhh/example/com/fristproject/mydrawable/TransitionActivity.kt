package xhh.example.com.fristproject.mydrawable

import android.graphics.drawable.TransitionDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_transition.*
import xhh.example.com.fristproject.R

class TransitionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition)
        val drawable = imageView.drawable as TransitionDrawable
        button2.setOnClickListener {
            drawable.startTransition(1000)
        }
        button3.setOnClickListener {
            drawable.resetTransition()
        }
    }
}
