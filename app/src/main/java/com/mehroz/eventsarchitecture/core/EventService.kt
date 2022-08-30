package com.mehroz.eventsarchitecture.core

import android.content.Context

interface EventService {
    val loggingType: LoggingType
    fun init(context: Context)
    fun log(event: EventData)
}