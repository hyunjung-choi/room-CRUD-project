package com.hyunjung.roomexample.db

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface SubscriberDAO {

    // Return the row id
    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber) : Long

    // Retrun the number of rows that were updated
    @Update
    suspend fun updateSubscriber(subscriber: Subscriber) : Int

    // Retrun the number of rows that were deleted
    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber) : Int

    // Retrun the number of rows that were deleted
    @Query("DELETE FROM subscriber_data_table")
    suspend fun deleteAll() : Int

    @Query("SELECT * FROM subscriber_data_table")
    fun getAllSubscribers() : Flow<List<Subscriber>>
}