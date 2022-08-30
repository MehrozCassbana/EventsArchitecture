package com.mehroz.eventsarchitecture.core.provider

import android.annotation.SuppressLint
import android.content.Context
import com.mehroz.eventsarchitecture.core.EventData
import com.mehroz.eventsarchitecture.core.EventService
import com.mehroz.eventsarchitecture.core.LoggingType
import timber.log.Timber

class FirebaseEventProvider : EventService {
    override val loggingType: LoggingType
        get() = LoggingType.FIREBASE

    override fun init(context: Context) {
        Timber.tag("Firebase").d("Firebase Init")
    }

    @SuppressLint("BinaryOperationInTimber")
    override fun log(event: EventData) {
        Timber.d(
            "\n--FIREBASE--\n" +
                    "\n*-*-*-*-*-*-*-*-*-*-*\n" +
                    "Event sent \nEvent Name : ${event.eventName}, \nParams: ${event.params}" +
                    "\n*-*-*-*-*-*-*-*-*-*-*"
        )    }
}