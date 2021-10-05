package com.example.fitnessapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitnessapp.R
import com.example.fitnessapp.db.RunDAO
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {



    @Inject
    lateinit var runDAO: RunDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Log.d("runDAO", "RunDAO: ${runDAO.hashCode()}")



    }
}