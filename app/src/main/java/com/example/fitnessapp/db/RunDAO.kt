package com.example.fitnessapp.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("Select * from running_table order by timestamp desc")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

    @Query("Select * from running_table order by avg_speedInKmh desc")
    fun getAllRunsSortedByAvgSpeed(): LiveData<List<Run>>

    @Query("Select * from running_table order by durationInMs desc")
    fun getAllRunsSortedByDuration(): LiveData<List<Run>>

    @Query("Select * from running_table order by distanceInMeters desc")
    fun getAllRunsSortedByDistance(): LiveData<List<Run>>

    @Query("Select * from running_table order by caloriesBurned desc")
    fun getAllRunsSortedByCalories(): LiveData<List<Run>>



    @Query("select SUM(durationInMs) from running_table")
    fun getTotalDuration(): LiveData<Long>

    @Query("select SUM(caloriesBurned) from running_table")
    fun getTotalBurnedCalories(): LiveData<Int>

    @Query("select SUM(distanceInMeters) from running_table")
    fun getTotalDistance(): LiveData<Int>

    @Query("select AVG(avg_speedInKmh) from running_table")
    fun getTotalAvgSpeed(): LiveData<Float>

}