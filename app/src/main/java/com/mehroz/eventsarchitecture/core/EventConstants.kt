package com.mehroz.eventsarchitecture.core

sealed class EventConstants {
    object UserProfileOpened {
        const val EVENT_NAME = "User_profile_opened"

        object Params {
            const val USER_NAME = "user_name"
            const val USER_AGE = "user_age"
            const val USER_GENDER = "user_gender"
        }
    }

    object UserLogin {
        const val EVENT_NAME = "User_login"

        object Params {
            const val USER_NAME = "user_name"
        }
    }
}
