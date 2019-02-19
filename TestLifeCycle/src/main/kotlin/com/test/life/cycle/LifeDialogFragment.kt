package com.test.life.cycle

import android.content.Context
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * 功能描述：
 *
 * @author merlin
 * @date 2019/2
 */
class LifeDialogFragment : DialogFragment() {

    override fun dismissAllowingStateLoss() {
        super.dismissAllowingStateLoss()
        LifeLog.e("dialogFragment")
    }

    override fun show(manager: FragmentManager?, tag: String?) {
        super.show(manager, tag)
        LifeLog.e("dialogFragment")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        LifeLog.e("dialogFragment")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        LifeLog.e("dialogFragment")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LifeLog.e("dialogFragment")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        LifeLog.e("dialogFragment")
        val view = inflater.inflate(R.layout.life_cycle_dialog, container, false)
        view.findViewById<View>(R.id.life_cycle_dialog_cancel).setOnClickListener {
            dismissAllowingStateLoss()
        }
        return view
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        LifeLog.e("dialogFragment")
    }

    override fun onStart() {
        super.onStart()
        LifeLog.e("dialogFragment")
    }

    override fun onResume() {
        super.onResume()
        LifeLog.e("dialogFragment")
    }

    override fun onPause() {
        super.onPause()
        LifeLog.e("dialogFragment")
    }

    override fun onStop() {
        super.onStop()
        LifeLog.e("dialogFragment")
    }

    override fun onDetach() {
        super.onDetach()
        LifeLog.e("dialogFragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        LifeLog.e("dialogFragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        LifeLog.e("dialogFragment")
    }

}