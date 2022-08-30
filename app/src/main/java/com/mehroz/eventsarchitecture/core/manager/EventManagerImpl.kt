package com.mehroz.eventsarchitecture.core.manager

import android.content.Context
import com.mehroz.eventsarchitecture.core.EventData
import com.mehroz.eventsarchitecture.core.EventService
import com.mehroz.eventsarchitecture.core.LoggingType

open class EventManagerImpl : EventManager {

    private val _services: MutableList<EventService> = mutableListOf()

    override fun init(context: Context) {
        _services.forEach { it.init(context) }
    }

    override fun log(event: EventData, loggingType: LoggingType) {
        when (loggingType) {
            LoggingType.ALL -> logAllServices(event)
            else -> logSpecificProvider(event, loggingType)
        }
    }

    override fun add(eventService: EventService) {
        _services.add(eventService)
    }

    private fun logAllServices(event: EventData) {
        _services.forEach { it.log(event) }
    }

    private fun logSpecificProvider(event: EventData, loggingType: LoggingType) {
        _services.forEach {
            if (it.loggingType == loggingType) it.log(event)
        }
    }
}