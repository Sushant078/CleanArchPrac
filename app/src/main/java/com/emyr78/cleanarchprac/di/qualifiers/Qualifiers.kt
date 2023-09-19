package com.emyr78.cleanarchprac.di.qualifiers

import javax.inject.Qualifier
import javax.inject.Scope


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class MessageQualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class EmailQualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class NumberOfCores

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class PrivateToDSC

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class CtxMain

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class MyScope