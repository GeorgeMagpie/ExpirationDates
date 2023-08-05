package com.example.expirationdates.data

import kotlinx.coroutines.flow.Flow

interface Repository {

    fun getAllExpirationDates(): Flow<List<ExpirationDates>>

    fun getDatesFromDate(): Flow<List<ExpirationDates>>
    fun getExpirationDatesFromId(): Flow<ExpirationDates?>

    suspend fun insertDates(expirationDates: ExpirationDates)
    suspend fun deleteDates(expirationDates: ExpirationDates)
    suspend fun updateDates(expirationDates: ExpirationDates)


}