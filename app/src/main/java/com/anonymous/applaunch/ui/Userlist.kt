package com.anonymous.applaunch.ui

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.anonymous.applaunch.UserViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun Userlist(navHostController: NavHostController,userViewModel: UserViewModel = hiltViewModel())
{


    val getalluser = userViewModel.getallUser()




}