package xhh.example.com.fristproject

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import kotlinx.android.synthetic.main.activity_spannable_string.*
// https://www.jianshu.com/p/f004300c6920  这是一篇博客的地址讲的是如何使用
class SpannableStringActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spannable_string)
        val stringbuilder = SpannableString(spannble_textiew.text)
        val foregroundspan = ForegroundColorSpan(Color.parseColor("#009ad6"))
        stringbuilder.setSpan(foregroundspan,0,8,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannble_textiew.text = stringbuilder
    }
}
