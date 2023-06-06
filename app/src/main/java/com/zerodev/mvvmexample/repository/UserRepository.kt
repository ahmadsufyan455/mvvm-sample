package com.zerodev.mvvmexample.repository

import com.zerodev.mvvmexample.model.User

interface UserRepository {
    fun getUser(name: String): User
}