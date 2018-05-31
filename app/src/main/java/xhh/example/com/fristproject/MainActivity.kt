package xhh.example.com.fristproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//使用const 将变量编译为编译器常量 就是在编译的时候变量的数值就已经确定了
const  val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity,DisplayMessageActivity::class.java)

            intent.putExtra("message",  getString(R.string.strings))
            startActivity(intent)
        }

    }
}
