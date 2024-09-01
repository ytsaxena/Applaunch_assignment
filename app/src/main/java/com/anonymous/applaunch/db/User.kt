package com.anonymous.applaunch.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "USER_TABLE")
data class User(
    @PrimaryKey(autoGenerate = true) val userId: Int,
    @ColumnInfo val first_name: String?,
    @ColumnInfo val last_name: String?,
    @ColumnInfo val email: String?,
)



