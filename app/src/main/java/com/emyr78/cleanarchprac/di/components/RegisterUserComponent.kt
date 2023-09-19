package com.emyr78.cleanarchprac.di.components

import com.emyr78.cleanarchprac.MainActivity
import com.emyr78.cleanarchprac.di.modules.UserServiceModule
import com.emyr78.cleanarchprac.models.RegisterUser
import dagger.Component

@Component(modules = [UserServiceModule::class])
interface RegisterUserComponent {
    fun getRegisterUser() : RegisterUser

//    fun inject(activity: MainActivity)
}