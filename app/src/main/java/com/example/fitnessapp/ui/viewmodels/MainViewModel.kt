package com.example.fitnessapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.fitnessapp.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val mainRepository: MainRepository) : ViewModel() {


}