package com.example.mvvm_hybridge.domain.usecases

import com.example.mvvm_hybridge.data.AgeRepository
import com.example.mvvm_hybridge.data.UserRepository
import com.example.mvvm_hybridge.domain.models.User

class GetUserUseCase(
    private val userRepository: UserRepository,
    private val ageRepository: AgeRepository
) {
    fun execute(): User = User(
        name = userRepository.getUserName(),
        age = ageRepository.getUserAge()
    )
}

