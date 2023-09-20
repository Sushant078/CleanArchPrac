package com.emyr78.cleanarchprac

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emyr78.cleanarchprac.di.components.ActionsComponent
import com.emyr78.cleanarchprac.di.components.DaggerActionsComponent
import com.emyr78.cleanarchprac.di.components.DaggerDatabaseComponent
import com.emyr78.cleanarchprac.di.components.DaggerRegisterUserComponent
import com.emyr78.cleanarchprac.di.components.DatabaseComponent
import com.emyr78.cleanarchprac.di.modules.ActionsModule
import com.emyr78.cleanarchprac.di.qualifiers.PrivateToDC
import com.emyr78.cleanarchprac.models.RegisterUser
import com.emyr78.cleanarchprac.models.ToastMaker
import com.emyr78.cleanarchprac.models.db.Database
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
//    @Inject
//    lateinit var registerUser: RegisterUser

    @Inject
    lateinit var toastMaker: ToastMaker

    @Inject
    lateinit var toastMaker2: ToastMaker

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    @PrivateToDC
    lateinit var dbObj : Database

    @Inject
    @PrivateToDC
    lateinit var dbObj2 : Database

    private lateinit var actionsComponent: ActionsComponent
//    private lateinit var databaseComponent: DatabaseComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        DaggerRegisterUserComponent.create().inject(this)
//        registerUser.registerUser("sushant","sushant@mail")

        actionsComponent = DaggerActionsComponent.builder()
            .actionsModule(ActionsModule(this))
            .databaseComponent(DaggerDatabaseComponent.create())
            .build()

//        databaseComponent = DaggerDatabaseComponent.create()
//        databaseComponent.injectIntoMain(this)
//
        actionsComponent.injectIntoMain(this)
//
        dbObj.hashCode()

        toastMaker.showToast()
        sharedPreferences.all
    }
}