package com.emyr78.cleanarchprac.models

import android.util.Log
import com.emyr78.cleanarchprac.di.qualifiers.MessageQualifier
import javax.inject.Inject

class RegisterUser @Inject constructor(
    private val userRepo: UserRepo,
    @MessageQualifier private val userService: UserService
) {
    fun registerUser(userName: String, userEmail: String) {
        userRepo.createUser(userName)
        Log.d("#D", "Creation Done")
        userService.sendNotification(userEmail)
    }
}