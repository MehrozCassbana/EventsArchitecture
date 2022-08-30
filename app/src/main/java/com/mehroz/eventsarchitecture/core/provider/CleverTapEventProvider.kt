package com.mehroz.eventsarchitecture.core.provider

import android.annotation.SuppressLint
import android.content.Context
import com.mehroz.eventsarchitecture.core.EventData
import com.mehroz.eventsarchitecture.core.EventService
import com.mehroz.eventsarchitecture.core.LoggingType
import timber.log.Timber

class CleverTapEventProvider : EventService {
    override val loggingType: LoggingType
        get() = LoggingType.CLEVERTAP

    override fun init(context: Context) {
        Timber.tag("CleverTap").d("CleverTap Init")
    }

    @SuppressLint("BinaryOperationInTimber")
    override fun log(event: EventData) {
        Timber.d(
            "\n--CLEVERTAP--\n" +
                    "\n*-*-*-*-*-*-*-*-*-*-*\n" +
                    "Event sent \nEvent Name : ${event.eventName}, \nParams: ${event.params}" +
                    "\n*-*-*-*-*-*-*-*-*-*-*"
        )
    }
}