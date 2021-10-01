package com.example.fitnessapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters

@Database(
    entities = [Run::class],
    version = 1
)

@TypeConverters(Converter::class)
abstract class RunDB: RoomDatabase() {

    abstract fun getRunDAO(): RunDAO

}