package com.emyr78.cleanarchprac.di.components

import com.emyr78.cleanarchprac.MainActivity
import com.emyr78.cleanarchprac.di.modules.DatabaseModule
import com.emyr78.cleanarchprac.di.modules.DatabaseModuleParent
import com.emyr78.cleanarchprac.di.qualifiers.PrivateToDC
import com.emyr78.cleanarchprac.models.db.Database
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DatabaseModuleParent::class])
interface DatabaseComponent {
    @get:PrivateToDC
    val database : Database
//    fun injectIntoMain(mainActivity: MainActivity)
}