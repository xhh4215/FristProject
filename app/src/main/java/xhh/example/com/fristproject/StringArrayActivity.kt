package xhh.example.com.fristproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_string_array.*



/***
 * 这是一个资源文件夹下的string数组的使用
 * 将数组的内容显示的一个listview 中
 */
class StringArrayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_string_array)
        val username = ""
        val mailCount = 0
        val text = getString(R.string.welcome_message, username, mailCount)
        button_string.setOnClickListener{
            Toast.makeText(this@StringArrayActivity, "点我干啥",Toast.LENGTH_LONG).show()
            button_string.text = text
        }
        val adapter = ArrayAdapter<String>(this@StringArrayActivity, android.R.layout.simple_list_item_1,resources.getStringArray(R.array.android_array))
        listviewid.adapter = adapter

    }
}
