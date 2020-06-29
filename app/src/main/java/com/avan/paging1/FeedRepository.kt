package com.avan.paging1

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.paging.PagedList
import androidx.paging.PagingData
import androidx.paging.toLiveData
import com.avan.paging1.model.Feed

class FeedRepository(var feedDao : FeedDao) {
    fun insertTestData() {
        feedDao.insert(Feed(20, "aaa"), Feed(30, "bbb"))
    }

    fun getFeedList(): LiveData<PagedList<Feed>> {
        return feedDao.load().toLiveData(pageSize = 20)
    }

}
