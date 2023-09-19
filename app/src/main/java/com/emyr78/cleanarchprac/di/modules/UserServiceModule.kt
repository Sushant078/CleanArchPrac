package com.emyr78.cleanarchprac.di.modules

import com.emyr78.cleanarchprac.di.qualifiers.EmailQualifier
import com.emyr78.cleanarchprac.di.qualifiers.MessageQualifier
import com.emyr78.cleanarchprac.models.EmailUserService
import com.emyr78.cleanarchprac.models.MessageUserService
import com.emyr78.cleanarchprac.models.UserService
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserServiceModule {
    @Binds
    @EmailQualifier
    abstract fun getEmailUserService(emailUserService: EmailUserService) : UserService

    companion object {
        @Provides
        @MessageQualifier
        fun getMessageUserService(messageUserService : MessageUserService): UserService {
            return messageUserService
        }
    }
}