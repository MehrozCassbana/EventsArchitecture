package com.mehroz.eventsarchitecture.presentation

import androidx.lifecycle.ViewModel
import com.mehroz.eventsarchitecture.domain.event.MainEventUseCase
import com.mehroz.eventsarchitecture.domain.model.User
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val mainEventUseCase: MainEventUseCase): ViewModel() {

}