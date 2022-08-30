package com.mehroz.eventsarchitecture.core.provider

import android.annotation.SuppressLint
import android.content.Context
import com.mehroz.eventsarchitecture.core.EventData
import com.mehroz.eventsarchitecture.core.EventService
import com.mehroz.eventsarchitecture.core.LoggingType
import timber.log.Timber

class AzureEventProvider : EventService {
    override val loggingType: LoggingType
        get() = LoggingType.AZURE

    override fun init(context: Context) {
        Timber.tag("Azure").d("Azure Init")
    }

    @SuppressLint("BinaryOperationInTimber")
    override fun log(event: EventData) {
        Timber.d(
            "\n--AZURE--\n" +
                    "\n*-*-*-*-*-*-*-*-*-*-*\n" +
                    "Event sent \nEvent Name : ${event.eventName}, \nParams: ${event.params}" +
                    "\n*-*-*-*-*-*-*-*-*-*-*"
        )
    }
}