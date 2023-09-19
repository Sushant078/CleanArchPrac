package com.emyr78.cleanarchprac.models

import android.util.Log
import javax.inject.Inject

interface UserService{
    fun sendNotification(userEmail:String){
        Log.d("#D","notification sent to $userEmail")
    }
}

class EmailUserService @Inject constructor() : UserService{
    override fun sendNotification(userEmail: String) {
        Log.d("#D","email notification sent to $userEmail")
    }
}

class MessageUserService @Inject constructor(): UserService{
    override fun sendNotification(userEmail: String) {
        Log.d("#D","message notification sent to $userEmail")
    }
}