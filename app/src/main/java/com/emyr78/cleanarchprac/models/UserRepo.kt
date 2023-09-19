package com.emyr78.cleanarchprac.models

import android.util.Log
import javax.inject.Inject

class UserRepo @Inject constructor() {
    fun createUser(userName: String){
        Log.d("#D","User created $userName")
    }
}