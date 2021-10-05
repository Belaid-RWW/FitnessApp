package com.example.fitnessapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.fitnessapp.db.Run
import com.example.fitnessapp.db.RunDB
import com.example.fitnessapp.other.Constants.RUN_DB_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDataBase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(app, RunDB::class.java, RUN_DB_NAME).build()

    @Singleton
    @Provides
    fun provideRunDAO(db: RunDB) = db.getRunDAO()

}