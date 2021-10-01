package com.example.fitnessapp.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="running_table")
data class Run (
    var img: Bitmap? = null,
    var timestamp: Long = 0L,
    var avg_speedInKmh: Float = 0F,
    var distanceInMeters: Int = 0,
    var durationInMs: Long = 0L,
    var caloriesBurned: Int = 0

        ) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}