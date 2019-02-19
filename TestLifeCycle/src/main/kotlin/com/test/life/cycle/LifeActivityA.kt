package com.test.life.cycle

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.widget.PopupWindow
import com.test.base.activity.BaseActivity
import kotlinx.android.synthetic.main.life_cycle_test.*

/**
 * 功能描述：
 *
 * @author merlin
 * @date 2019/2
 */
class LifeActivityA : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.life_cycle_test)
        LifeLog.e("A")
        life_cycle_activityB.setOnClickListener {
            startActivityForResult(Intent(this, LifeActivityB::class.java), 1)
        }
        life_cycle_fragment.setOnClickListener {
            startActivity(Intent(this, LifeActivityFragment::class.java))
        }
        life_cycle_dialogFragment.setOnClickListener {
            val dialog = LifeDialogFragment()
            dialog.show(supportFragmentManager, "")
        }
        life_cycle_dialog.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.life_cycle_dialog)
            dialog.show()
        }
        life_cycle_popupWindow.setOnClickListener {
            val pop = PopupWindow(this)
            pop.contentView = LayoutInflater.from(this).inflate(R.layout.life_cycle_dialog, null)
            pop.contentView.setOnClickListener {
                pop.dismiss()
            }
            pop.showAsDropDown(life_cycle_popupWindow)

        }
        life_cycle_singleTask.setOnClickListener {
            startActivityForResult(Intent(this, LifeActivitySingleTask::class.java), 1)
        }
        life_cycle_logPath.setOnClickListener {
            LifeLog.print()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        LifeLog.e("A")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        LifeLog.e("A")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        LifeLog.e("A")
    }

    override fun onStart() {
        super.onStart()
        LifeLog.e("A")
    }

    override fun onResume() {
        super.onResume()
        LifeLog.e("A")
    }

    override fun onPause() {
        super.onPause()
        LifeLog.e("A")
    }

    override fun onStop() {
        super.onStop()
        LifeLog.e("A")
    }

    override fun onDestroy() {
        super.onDestroy()
        LifeLog.e("A")
    }

}
