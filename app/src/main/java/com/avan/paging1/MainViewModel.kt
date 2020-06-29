package com.avan.paging1

import androidx.lifecycle.ViewModel
import androidx.paging.DataSource
import androidx.paging.toLiveData
import com.avan.paging1.model.Feed
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainViewModel  (feedRepo : FeedRepository) : ViewModel(){
    // The Int type argument corresponds to a PositionalDataSource object.
    val feedList = feedRepo.getFeedList()
    init{
        GlobalScope.launch {
            feedRepo.insertTestData()
        }
    }
}