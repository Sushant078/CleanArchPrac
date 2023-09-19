package com.emyr78.cleanarchprac.models.db

class Database constructor(
    private val databaseSchema: DatabaseSchema,
    private val databaseConnectionPool: DatabaseConnectionPool
) {
    fun getDB():String{
        return "${databaseSchema.hashCode()} : ${databaseConnectionPool.hashCode()}"
    }
}