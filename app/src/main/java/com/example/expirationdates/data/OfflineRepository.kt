package com.example.expirationdates.data

import kotlinx.coroutines.flow.Flow

class OfflineRepository(private val datesDao: ExpirationDatesDAO): Repository {
    override fun getAllExpirationDates(): Flow<List<ExpirationDates>> = datesDao.getDatesOrderedName()

    override fun getExpirationDatesFromId(): Flow<ExpirationDates?> = datesDao.getDatesOrderedID()

    override fun getDatesFromDate(): Flow<List<ExpirationDates>> = datesDao.getDatesOrderedDate()

    override suspend fun insertDates(expirationDates: ExpirationDates) = datesDao.insertDates(expirationDates)

    override suspend fun deleteDates(expirationDates: ExpirationDates) = datesDao.deleteDates(expirationDates)

    override suspend fun updateDates(expirationDates: ExpirationDates) = datesDao.updateDates(expirationDates)
}