package com.example.expirationdates.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ExpirationDatesDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE )
    suspend fun insertDates(expirationDates: ExpirationDates)

    @Update
    suspend fun updateDates(expirationDates: ExpirationDates)

    @Delete
    suspend fun deleteDates(expirationDates: ExpirationDates)

    @Query("SELECT * FROM `expiration dates` ORDER BY name ASC")
    fun getDatesOrderedName(): Flow<List<ExpirationDates>>

    @Query("SELECT * FROM `expiration dates` ORDER BY date ASC")
    fun getDatesOrderedDate(): Flow<List<ExpirationDates>>

    @Query("SELECT * from `expiration dates` WHERE id")
    fun getDatesOrderedID(): Flow<ExpirationDates>
}