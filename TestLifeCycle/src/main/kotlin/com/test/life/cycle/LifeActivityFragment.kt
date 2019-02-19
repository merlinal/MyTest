package com.test.life.cycle

import android.os.Bundle
import com.test.base.activity.BaseActivity
import com.test.base.util.LogUtil

/**
 * 功能描述：
 *
 * @author merlin
 * @date 2019/2
 */
class LifeActivityFragment : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.life_cycle_container)
        LifeLog.e("activity")
        supportFragmentManager.beginTransaction()
                .replace(R.id.life_cycle_container, LifeFragmentTest())
                .commitAllowingStateLoss()
    }

    override fun onStart() {
        super.onStart()
        LifeLog.e("activity")
    }

    override fun onResume() {
        super.onResume()
        LifeLog.e("activity")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        LifeLog.e("activity")
    }

    override fun onPause() {
        super.onPause()
        LifeLog.e("activity")
    }

    override fun onStop() {
        super.onStop()
        LifeLog.e("activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        LifeLog.e("activity")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        LifeLog.e("activity")
    }

}
