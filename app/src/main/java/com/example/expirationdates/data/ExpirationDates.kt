package com.example.expirationdates.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "Expiration dates" )
data class ExpirationDates(
        val name: String,
        val date: Date,
        val barcode: Long,
        val quantity: Int,
        @PrimaryKey(autoGenerate = true)
        val id: Int = 0,
)
