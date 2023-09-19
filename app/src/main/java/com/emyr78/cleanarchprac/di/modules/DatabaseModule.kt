package com.emyr78.cleanarchprac.di.modules

import com.emyr78.cleanarchprac.di.qualifiers.NumberOfCores
import com.emyr78.cleanarchprac.di.qualifiers.PrivateToDSC
import com.emyr78.cleanarchprac.models.db.Database
import com.emyr78.cleanarchprac.models.db.DatabaseConnectionPool
import com.emyr78.cleanarchprac.models.db.DatabaseSchema
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {

    @NumberOfCores
    @Provides
    fun getNumberOfCores(): Int {
        return 10;
    }

    @Provides
    fun getDatabaseSchema(): DatabaseSchema {
        return DatabaseSchema();
    }

    @Provides
    fun getDatabaseConnectionPool(@NumberOfCores concurrencyNum: Int): DatabaseConnectionPool {
        return DatabaseConnectionPool(concurrencyNum)
    }

    @PrivateToDSC
    @Provides
    fun getDatabase(
        databaseSchema: DatabaseSchema,
        databaseConnectionPool: DatabaseConnectionPool
    ): Database {
        return Database(databaseSchema, databaseConnectionPool)
    }
}