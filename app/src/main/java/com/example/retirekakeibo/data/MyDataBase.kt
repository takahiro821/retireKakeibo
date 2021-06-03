package com.example.retirekakeibo.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [JournalSlip::class], version = 1, exportSchema = false)
abstract class MyDataBase: RoomDatabase() {

    abstract fun journalSlipDao(): JournalSlipDao
}