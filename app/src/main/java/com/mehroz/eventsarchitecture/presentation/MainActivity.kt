package com.mehroz.eventsarchitecture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mehroz.eventsarchitecture.R
import com.mehroz.eventsarchitecture.domain.event.MainEventUseCase
import com.mehroz.eventsarchitecture.domain.model.User
import com.mehroz.eventsarchitecture.core.LoggingType
import com.mehroz.eventsarchitecture.core.manager.EventManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mainEventUseCase: MainEventUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        val user = User("mehroz", 26, "male")
        /**
         * this will send the event to all the event providers
         */
        mainEventUseCase.logUserProfileEvent(user)
        /**
         * This is send to only specific provider
         */
        mainEventUseCase.logUserLoginEvent(user, LoggingType.FIREBASE)
        mainEventUseCase.logUserLoginEvent(user, LoggingType.CLEVERTAP)
    }
}