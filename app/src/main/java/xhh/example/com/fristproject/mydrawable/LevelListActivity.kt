package xhh.example.com.fristproject.mydrawable

import android.graphics.drawable.LevelListDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_level_list.*
import xhh.example.com.fristproject.R

class LevelListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_list)
        val drawable = levellistimageview.drawable as LevelListDrawable
        levellistbuttonid.setOnClickListener {
            for (i in 1..4) {
                drawable.setLevel(i)
            }
        }
    }
}
