package com.anonymous.applaunch

import android.content.Context
import androidx.room.Room
import com.anonymous.applaunch.db.UserDao
import com.anonymous.applaunch.db.UserDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): UserDb {
        return Room.databaseBuilder(
            context,
            UserDb::class.java,
            "app_database"
        ).build()
    }

    @Provides
    fun provideUserDao(database: UserDb): UserDao {
        return database.userdao()
    }
}