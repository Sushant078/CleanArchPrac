package com.emyr78.cleanarchprac

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emyr78.cleanarchprac.di.components.ActionsComponent
import com.emyr78.cleanarchprac.di.components.DaggerActionsComponent
import com.emyr78.cleanarchprac.di.components.DaggerRegisterUserComponent
import com.emyr78.cleanarchprac.di.modules.ActionsModule
import com.emyr78.cleanarchprac.models.RegisterUser
import com.emyr78.cleanarchprac.models.ToastMaker
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

    private lateinit var actionsComponent: ActionsComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        DaggerRegisterUserComponent.create().inject(this)
//        registerUser.registerUser("sushant","sushant@mail")

        actionsComponent = DaggerActionsComponent.builder()
            .actionsModule(ActionsModule(this))
            .build()

        actionsComponent.injectIntoMain(this)

        toastMaker.showToast()
        sharedPreferences.all
    }
}