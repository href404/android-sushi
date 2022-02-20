package com.href404.sushyy

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface FoodDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: FoodItem)

    @Delete
    suspend fun delete(item: FoodItem)

    @Query("SELECT * FROM food_items")
    fun getAllFoodItems(): LiveData<List<FoodItem>>
}