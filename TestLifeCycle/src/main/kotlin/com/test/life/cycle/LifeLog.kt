package com.test.life.cycle

import android.util.Log

/**
 * 功能描述：
 *
 * @author merlin
 * @date 2019/2
 */
object LifeLog {

    private val sb = StringBuilder()

    private val callerStackTraceElement: StackTraceElement
        get() = Thread.currentThread().stackTrace[4]

    fun e(content: String) {
        var tag = "%s.%s(L:%d)"
        val caller = callerStackTraceElement
        var callerClazzName = caller.className
        callerClazzName = callerClazzName.substring(callerClazzName.lastIndexOf(".") + 1)
        tag = String.format(tag, callerClazzName, caller.methodName, caller.lineNumber)
        val logContent = content + "-" + caller.methodName
        sb.append("$logContent    ——>   ")
        Log.e(tag, logContent)
    }

    fun print() {
        Log.e("log_path", sb.toString())
        sb.clear()
    }


}
