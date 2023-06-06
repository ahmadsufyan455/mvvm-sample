package com.zerodev.mvvmexample.repository

import com.zerodev.mvvmexample.model.User

class UserRepositoryImpl : UserRepository {
    override fun getUser(name: String): User {
        return User(name = name)
    }
}