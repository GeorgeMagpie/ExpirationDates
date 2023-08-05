package com.example.expirationdates.data


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(version = 1, exportSchema = false)
abstract class DatesBase: RoomDatabase() {
    abstract fun datesDao(): ExpirationDatesDAO

    companion object{
        @Volatile
        private var Instance: DatesBase? = null

        fun getDatabase(context: Context): DatesBase{
            return Instance?: synchronized(this) {
                Room.databaseBuilder(context, DatesBase::class.java, "Expiration_dates")
                        .build()
                        .also { Instance = it }
            }
        }
    }

}