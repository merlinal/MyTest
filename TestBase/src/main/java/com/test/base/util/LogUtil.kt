package com.test.base.util

import android.util.Log

import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by ncm on 16/11/7.
 */
object LogUtil {

    private val callerStackTraceElement: StackTraceElement
        get() = Thread.currentThread().stackTrace[5]

    fun v(content: String) {
        Log.d(generateTag(), content)
    }

    fun d(content: String) {
        Log.d(generateTag(), content)
    }

    fun i(content: String) {
        Log.i(generateTag(), content)
    }

    fun w(content: String) {
        Log.w(generateTag(), content)
    }

    fun e(content: String) {
        Log.e(generateTag(), content)
    }

    fun wtf(t: Throwable) {
        Log.wtf(generateTag(), t)
    }

    fun wtf(content: String) {
        Log.wtf(generateTag(), content)
    }

    fun json(content: String) {
        printJson(generateTag(), content)
    }

    private fun generateTag(): String {
        var tag = "%s.%s(L:%d)"
        val caller = callerStackTraceElement
        var callerClazzName = caller.className
        callerClazzName = callerClazzName.substring(callerClazzName.lastIndexOf(".") + 1)
        tag = String.format(tag, callerClazzName, caller.methodName, caller.lineNumber)
        return tag
    }

    private fun printJson(tag: String, msg: String) {
        var message: String
        try {
            if (msg.startsWith("{")) {
                message = JSONObject(msg).toString(4)
            } else if (msg.startsWith("[")) {
                message = JSONArray(msg).toString(4)
            } else {
                message = msg
            }
        } catch (e: JSONException) {
            message = msg
        }

        val lines = message.split(System.getProperty("line.separator").toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        blockStart(tag)
        for (line in lines) {
            Log.d(tag, "║ $line")
        }
        blockEnd(tag)
    }

    private fun blockStart(tag: String) {
        Log.d(tag, "╔═══════════════════════════════════════════════════════════════════════════════════════")
    }

    private fun blockEnd(tag: String) {
        Log.d(tag, "╚═══════════════════════════════════════════════════════════════════════════════════════")
    }

}
