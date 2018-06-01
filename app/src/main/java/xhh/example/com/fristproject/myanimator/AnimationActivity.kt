package xhh.example.com.fristproject.myanimator

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_animation.*
import xhh.example.com.fristproject.R

class AnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

//      对XML定义的属性动画的使用
        val animatorset = AnimatorInflater.loadAnimator(this@AnimationActivity, R.animator.animator_frist) as AnimatorSet
        animatorset.setTarget(animatorid)
        animatorid.setOnClickListener {
            animatorset.start()
        }
//      对XML文件定义的视图动画的使用
        val animset = AnimationUtils.loadAnimation(this@AnimationActivity, R.anim.anim_frist)
        animatorid2.setOnClickListener {
            animatorid2.startAnimation(animset)
        }
//        逐帧动画的使用
        animatorimage.setBackgroundResource(R.drawable.frameanimator)
        val drawable = animatorimage.background as AnimationDrawable
        button_start.setOnClickListener {
            drawable.start()
        }
        button_end.setOnClickListener {
            drawable.stop()
        }
    }
}
