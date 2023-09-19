package com.emyr78.cleanarchprac.models.db

class DatabaseConnectionPool constructor(private val concurrencyNum: Int){
    fun getDBPoolSize():Int{
        return concurrencyNum
    }
}