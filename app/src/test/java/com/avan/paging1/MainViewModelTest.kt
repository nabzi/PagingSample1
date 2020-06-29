package com.avan.paging1

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.arch.core.util.Function
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.avan.paging1.model.Feed
import com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory.executor
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import java.util.concurrent.Executors


class MainViewModelTest{
    @Rule
    @JvmField
    var instantExecutorRule = InstantTaskExecutorRule()
    var feedRepository = Mockito.mock(FeedRepository::class.java)

    @Test
    fun test1(){
        val executor = Executors.newFixedThreadPool(5)

        //var list : PagedList<Feed> =
        //`when`(feedRepository.feedDao.load()).thenReturn()
        var mainViewModel = MainViewModel(feedRepository)
    }

}