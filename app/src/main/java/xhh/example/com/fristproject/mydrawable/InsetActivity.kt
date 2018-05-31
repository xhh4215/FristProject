package xhh.example.com.fristproject.mydrawable

import android.graphics.drawable.ClipDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_clip.*
import xhh.example.com.fristproject.R

class InsetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scale)
//        button_clip.setOnClickListener{
//           val drawable =  image_clip.background as ClipDrawable
////            level 的变大会使裁剪量减少
//              drawable.setLevel(drawable.level +7000)
//        }

    }
}
