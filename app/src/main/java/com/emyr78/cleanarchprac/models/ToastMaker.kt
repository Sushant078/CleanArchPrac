package com.emyr78.cleanarchprac.models

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.emyr78.cleanarchprac.di.qualifiers.CtxMain
import com.emyr78.cleanarchprac.di.qualifiers.MyScope
import javax.inject.Inject

@MyScope
class ToastMaker @Inject constructor(@CtxMain private val context:Context) {
    init {
        Log.d("#D","Constructor de ToastMaker")
    }
    fun showToast(){
        Toast.makeText(context,"This is a Toast",Toast.LENGTH_SHORT).show()
    }
}