package com.avan.paging1

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.avan.paging1.model.Feed

@Dao
abstract class FeedDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(vararg feed: Feed)

    @Query("SELECT * FROM feed " )
    abstract fun load(): DataSource.Factory<Int, Feed>
}
