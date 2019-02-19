package com.test.skill

import android.os.Bundle
import android.view.MotionEvent
import android.widget.EditText
import android.widget.Toast
import com.test.base.activity.BaseActivity
import kotlinx.android.synthetic.main.skill_edit_touch.*

/**
 * 功能描述：
 *
 * @author merlin
 * @date 2018/10
 */
class SkillEditTouchActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skill_edit_touch)
        /** 方法2：为根节点设置点击事件 */
//        skill_touch_rootView.setOnClickListener { v ->
//            val imm = getSystemService(Context.INPUT_METHOD_SERVICE)
//                    as InputMethodManager
//            imm.hideSoftInputFromWindow(v.windowToken, 0)
//        }
//        skill_touch_text.setOnClickListener {
//
//        }
        /** 方法2 end */
    }

    /** 方法1：监听dispatchTouchEvent */

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        if (ev?.action == MotionEvent.ACTION_DOWN) {
            val v = currentFocus
            if (v is EditText) {
                val l = intArrayOf(0, 0)
                v.getLocationInWindow(l)
                onTouchEditText(ev.x > l[0]
                        && ev.x < l[0] + v.getWidth()
                        && ev.y > l[1]
                        && ev.y < l[1] + v.getHeight())
            }
        }
        return super.dispatchTouchEvent(ev)
    }

    private fun onTouchEditText(isTouchInEditText: Boolean) {
        //TODO 触摸点不在EditText内，关闭软键盘
        Toast.makeText(this,
                if (isTouchInEditText) "点击在输入框内" else "点击在输入框外",
                Toast.LENGTH_SHORT).show()
    }

    /** 方法1 end */

}