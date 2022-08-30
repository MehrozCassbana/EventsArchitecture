package com.mehroz.eventsarchitecture.core.manager

import android.content.Context
import com.mehroz.eventsarchitecture.core.EventData
import com.mehroz.eventsarchitecture.core.EventService
import com.mehroz.eventsarchitecture.core.LoggingType

interface EventManager {
    fun init(context: Context)
    fun log(event: EventData, loggingType: LoggingType)
    fun add(eventService: EventService)
}