package com.anonymous.applaunch.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Query("SELECT * FROM USER_TABLE")
    suspend fun getAll(): List<User>

    @Insert
    suspend fun insertUser(userdetail: User)

    @Delete
    suspend fun delete(userdetail: User)
}