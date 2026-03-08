package com.example.mvvm_hybridge.ui

import androidx.lifecycle.ViewModel
import com.example.mvvm_hybridge.data.AgeRepository
import com.example.mvvm_hybridge.data.UserRepository
import com.example.mvvm_hybridge.domain.models.User
import com.example.mvvm_hybridge.domain.usecases.GetUserUseCase

class UserViewModel : ViewModel() {
    private val getUserUseCase = GetUserUseCase(
        UserRepository(),
        AgeRepository()
    )

    fun getUser(): User = getUserUseCase.execute()
}