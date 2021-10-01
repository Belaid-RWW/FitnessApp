package com.example.fitnessapp.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream


//this class is used to convert images from bmp to bytes bcs ROOM DB doesn't handle complex types

class Converter {

    @TypeConverter
    fun toBitmap(bytes: ByteArray): Bitmap {
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
    }

    @TypeConverter
    fun fromBitmap(bmp: Bitmap): ByteArray {
        val outputStream = ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()
    }

}