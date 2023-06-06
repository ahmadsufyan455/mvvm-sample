package com.zerodev.mvvmexample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zerodev.mvvmexample.model.User
import com.zerodev.mvvmexample.repository.UserRepository

class UserViewModel(private val userRepository: UserRepository) : ViewModel() {
    private val _name = MutableLiveData<User>()
    val name get() = _name

    fun setName(name: String) {
        _name.postValue(userRepository.getUser(name))
    }
}