package com.example.retirekakeibo.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface JournalSlipDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertJournalSlip(journalSlip: JournalSlip)

    @Query("SELECT * FROM JournalSlips")
    fun observeJournalSlips(): LiveData<List<JournalSlip>>

    @Query("SELECT * FROM JournalSlips")
    fun getJournalSlips(): List<JournalSlip>

}