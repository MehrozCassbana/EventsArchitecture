package com.mehroz.eventsarchitecture.di

import android.content.Context
import com.mehroz.eventsarchitecture.core.manager.EventManagerImpl
import com.mehroz.eventsarchitecture.core.manager.EventManager
import com.mehroz.eventsarchitecture.core.provider.AzureEventProvider
import com.mehroz.eventsarchitecture.core.provider.CleverTapEventProvider
import com.mehroz.eventsarchitecture.core.provider.FirebaseEventProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Singleton
    @Provides
    fun provideAnalyticsManager(@ApplicationContext context: Context): EventManager {
        val analyticsManager = EventManagerImpl()
        analyticsManager.add(AzureEventProvider())
        analyticsManager.add(FirebaseEventProvider())
        analyticsManager.init(context)
        return analyticsManager
    }
}