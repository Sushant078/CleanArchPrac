package com.emyr78.cleanarchprac.di.components

import com.emyr78.cleanarchprac.di.modules.DatabaseModule
import com.emyr78.cleanarchprac.di.qualifiers.PrivateToDC
import com.emyr78.cleanarchprac.di.qualifiers.PrivateToDSC
import com.emyr78.cleanarchprac.models.db.Database
import dagger.Subcomponent


@Subcomponent(modules = [DatabaseModule::class])
interface DatabaseSubComponent {
    @PrivateToDSC
    fun database() : Database

    @Subcomponent.Builder
    interface Builder {
        fun build(): DatabaseSubComponent
    }
}