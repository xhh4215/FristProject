package xhh.example.com.fristproject.mydrawable

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bitmap.*
import xhh.example.com.fristproject.R

/****
 * 这是一个练习使用Bitmap可绘制资源的界面
 */
class BitmapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bitmap_xml)
//        当前是对一个Bitmap的资源文件的使用
//        bitmapid.setOnClickListener {
//            val drawable = resources.getDrawable(R.drawable.g)
//            bitmapid.setImageDrawable(drawable)
//        }
    }
}
