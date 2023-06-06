package com.zerodev.mvvmexample.di

import com.zerodev.mvvmexample.repository.UserRepository
import com.zerodev.mvvmexample.repository.UserRepositoryImpl

object Injection {
    fun provideRepository(): UserRepository {
        return UserRepositoryImpl()
    }
}