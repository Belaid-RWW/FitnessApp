package com.example.fitnessapp.repository

import com.example.fitnessapp.db.Run
import com.example.fitnessapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDAO: RunDAO
) {
    suspend fun insertRun(run: Run) = runDAO.insertRun(run)

    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunsSortedByDate() = runDAO.getAllRunsSortedByDate()
    fun getAllRunsSortedByDistance() = runDAO.getAllRunsSortedByDistance()
    fun getAllRunsSortedByDuration() = runDAO.getAllRunsSortedByDuration()
    fun getAllRunsSortedByAvgSpeed() = runDAO.getAllRunsSortedByAvgSpeed()
    fun getAllRunsSortedByCalories() = runDAO.getAllRunsSortedByCalories()

    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()
    fun getTotalDistance() = runDAO.getTotalDistance()
    fun getTotalBurnedCalories() = runDAO.getTotalBurnedCalories()
    fun getTotalDuration() = runDAO.getTotalDuration()

}