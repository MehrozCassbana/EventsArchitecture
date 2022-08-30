package com.mehroz.eventsarchitecture.core

open class EventData(
    val eventName: String,
    val params: Map<String, Any?>? = null
)