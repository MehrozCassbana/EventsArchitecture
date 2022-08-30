package com.mehroz.eventsarchitecture.presentation

import com.mehroz.eventsarchitecture.domain.model.User
import com.mehroz.eventsarchitecture.core.EventConstants
import com.mehroz.eventsarchitecture.core.EventData

object UserEvents {
    class UserProfileEvent(user: User) : EventData(
        EventConstants.UserProfileOpened.EVENT_NAME,
        mapOf(
            EventConstants.UserProfileOpened.Params.USER_NAME to user.name,
            EventConstants.UserProfileOpened.Params.USER_AGE to user.age,
            EventConstants.UserProfileOpened.Params.USER_GENDER to user.gender
        )
    )

    class UserLoginEvent(user: User) : EventData(
        EventConstants.UserLogin.EVENT_NAME,
        mapOf(
            EventConstants.UserLogin.Params.USER_NAME to user.name
        )
    )

}