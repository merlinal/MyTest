package com.test.life.cycle

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.test.base.fragment.BaseFragment

/**
 * 功能描述：
 *
 * @author merlin
 * @date 2019/2
 */
class LifeFragmentTest : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        LifeLog.e("fragment")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        LifeLog.e("fragment")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LifeLog.e("fragment")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        LifeLog.e("fragment")
        return inflater.inflate(R.layout.life_cycle_container, container, false)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        LifeLog.e("fragment")
    }

    override fun onStart() {
        super.onStart()
        LifeLog.e("fragment")
    }

    override fun onResume() {
        super.onResume()
        LifeLog.e("fragment")
    }

    override fun onPause() {
        super.onPause()
        LifeLog.e("fragment")
    }

    override fun onStop() {
        super.onStop()
        LifeLog.e("fragment")
    }

    override fun onDetach() {
        super.onDetach()
        LifeLog.e("fragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        LifeLog.e("fragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        LifeLog.e("fragment")
    }

}