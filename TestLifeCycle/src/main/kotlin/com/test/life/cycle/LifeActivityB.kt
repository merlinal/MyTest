package com.test.life.cycle

import android.os.Bundle
import com.test.base.activity.BaseActivity

/**
 * 功能描述：
 *
 * @author merlin
 * @date 2019/2
 */
class LifeActivityB : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.life_cycle_container)
        LifeLog.e("B")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        LifeLog.e("B")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        LifeLog.e("B")
    }

    override fun onStart() {
        super.onStart()
        LifeLog.e("B")
    }

    override fun onResume() {
        super.onResume()
        LifeLog.e("B")
    }

    override fun onPause() {
        super.onPause()
        LifeLog.e("B")
    }

    override fun onStop() {
        super.onStop()
        LifeLog.e("B")
    }

    override fun onDestroy() {
        super.onDestroy()
        LifeLog.e("B")
    }

}
