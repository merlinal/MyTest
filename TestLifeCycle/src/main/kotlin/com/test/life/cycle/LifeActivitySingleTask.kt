package com.test.life.cycle

import android.os.Bundle
import com.test.base.activity.BaseActivity

/**
 * 功能描述：
 *
 * @author merlin
 * @date 2019/2
 */
class LifeActivitySingleTask : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.life_cycle_container)
    }
}