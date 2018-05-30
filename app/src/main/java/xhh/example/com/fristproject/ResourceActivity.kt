package xhh.example.com.fristproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_resource.*

class ResourceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)
        Toast.makeText(this@ResourceActivity,"当前文本使用的是第二个资源",Toast.LENGTH_LONG).show()
        textView3.setOnClickListener{
            textView3.text = resources.getString(R.string.resource02)
            Toast.makeText(this@ResourceActivity,"当前文本使用的是第三个资源",Toast.LENGTH_LONG).show()

        }
    }
}
