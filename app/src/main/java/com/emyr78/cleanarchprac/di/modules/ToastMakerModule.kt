package com.emyr78.cleanarchprac.di.modules

import android.content.Context
import android.util.Log
import com.emyr78.cleanarchprac.di.qualifiers.CtxMain
import com.emyr78.cleanarchprac.di.qualifiers.MyScope
import com.emyr78.cleanarchprac.models.ToastMaker
import dagger.Module
import dagger.Provides

@Module
class ToastMakerModule {
    @Provides
    @MyScope
    fun provideToastMaker(@CtxMain context: Context): ToastMaker{
        Log.d("#D","Provider de ToastMaker")
        return ToastMaker(context)
    }
// CircularDependencyDagger2 -> Tab Recording
//    @Binds
//    abstract fun provideToastMaker(toastMaker: ToastMaker): ToastMaker
}