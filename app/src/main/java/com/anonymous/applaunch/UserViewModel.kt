package com.anonymous.applaunch

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anonymous.applaunch.db.User
import com.anonymous.applaunch.db.UserDao
import com.anonymous.applaunch.db.UserDb
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(val userdao: UserDao) :ViewModel() {

    fun insertUser(user :User) {
        viewModelScope.launch {
            userdao.insertUser(user)
        }

    }


    fun getallUser()
    {
        viewModelScope.launch {
           userdao.getAll()
        }
    }


    fun deleteUser(user :User) {

        viewModelScope.launch {
            userdao.delete(user)
        }

    }


}