package com.example.retirekakeibo

import android.app.Application
import androidx.room.Room
import com.example.retirekakeibo.data.MyDataBase
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApplication: Application() {

    @Inject
    lateinit var database: MyDataBase

    override fun onCreate() {
        super.onCreate()
    }
}