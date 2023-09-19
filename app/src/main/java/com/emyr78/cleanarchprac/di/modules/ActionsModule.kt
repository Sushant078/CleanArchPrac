package com.emyr78.cleanarchprac.di.modules

import android.content.Context
import android.content.SharedPreferences
import com.emyr78.cleanarchprac.di.qualifiers.CtxMain
import com.emyr78.cleanarchprac.di.qualifiers.MyScope
import dagger.Module
import dagger.Provides

@Module
class ActionsModule(private var context: Context) {
    @Provides
    @CtxMain
    fun providesContext():Context{
        return context
    }

// ProvidesContextCircularDependency -> Tab Recording
//    @Provides
//    fun providesContext():Context{
//        return context
//    }

    @Provides
    fun providesSharedPrefs(@CtxMain context: Context): SharedPreferences{
        return context.getSharedPreferences("PreferencesFile",Context.MODE_PRIVATE)
    }
}