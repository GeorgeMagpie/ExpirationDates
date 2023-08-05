package com.example.expirationdates.data

import android.content.Context

interface AppContainer {
    val repository: Repository

}

class AppDataContainer(private val context: Context) : AppContainer {

    override val repository: Repository by lazy {
        OfflineRepository(DatesBase.getDatabase(context).datesDao())
    }
}