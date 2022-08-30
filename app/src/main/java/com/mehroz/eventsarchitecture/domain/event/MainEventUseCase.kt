package com.mehroz.eventsarchitecture.domain.event

import com.mehroz.eventsarchitecture.domain.model.User
import com.mehroz.eventsarchitecture.core.LoggingType
import com.mehroz.eventsarchitecture.core.manager.EventManager
import com.mehroz.eventsarchitecture.presentation.UserEvents
import javax.inject.Inject

class MainEventUseCase @Inject constructor(private val eventManager: EventManager) {

    fun logUserProfileEvent(user: User, loggingType: LoggingType = LoggingType.ALL) {
        eventManager.log(
            UserEvents.UserProfileEvent(
                user
            ), loggingType
        )
    }

    fun logUserLoginEvent(user: User, loggingType: LoggingType = LoggingType.ALL) {
        eventManager.log(
            UserEvents.UserLoginEvent(
                user
            ),
            loggingType
        )
    }
}