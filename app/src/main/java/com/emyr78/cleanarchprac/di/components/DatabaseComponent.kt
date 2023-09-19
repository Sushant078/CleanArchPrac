package com.emyr78.cleanarchprac.di.components

import com.emyr78.cleanarchprac.di.modules.DatabaseModule
import com.emyr78.cleanarchprac.di.modules.DatabaseModuleParent
import com.emyr78.cleanarchprac.models.db.Database
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DatabaseModuleParent::class])
interface DatabaseComponent {
//    val database : Database
}