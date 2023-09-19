package com.emyr78.cleanarchprac.di.components

import android.app.Notification.Action
import com.emyr78.cleanarchprac.MainActivity
import com.emyr78.cleanarchprac.di.modules.ActionsModule
import com.emyr78.cleanarchprac.di.modules.ToastMakerModule
import com.emyr78.cleanarchprac.di.qualifiers.MyScope
import dagger.Component

@MyScope
@Component(modules = [ToastMakerModule::class,ActionsModule::class])
interface ActionsComponent {
    fun injectIntoMain(activity: MainActivity)
}