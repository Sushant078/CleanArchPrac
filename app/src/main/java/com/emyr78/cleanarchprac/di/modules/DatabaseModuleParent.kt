package com.emyr78.cleanarchprac.di.modules

import com.emyr78.cleanarchprac.di.components.DatabaseSubComponent
import com.emyr78.cleanarchprac.di.qualifiers.PrivateToDC
import com.emyr78.cleanarchprac.di.qualifiers.PrivateToDSC
import com.emyr78.cleanarchprac.models.db.Database
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [DatabaseSubComponent::class])
class DatabaseModuleParent {
    @Singleton
    @Provides
    @PrivateToDC
    fun getDatabase(databaseSubComponent: DatabaseSubComponent.Builder): Database{
        return databaseSubComponent.build().database()
    }
}