package com.example.mvvm_hybridge.domain.usecases

import com.example.mvvm_hybridge.data.AgeRepository

class GetAgeUseCase(private val repository: AgeRepository) {
    fun execute(): Int = repository.getUserAge()
}

