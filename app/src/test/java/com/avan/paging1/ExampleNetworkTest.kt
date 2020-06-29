package com.avan.paging1

import com.avan.paging1.model.Feed
import com.avan.paging1.network.RestApiFactory
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.junit.Assert.assertEquals
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

class ExampleNetworkTest {
    @Test
    fun fetch() {
        var api = RestApiFactory().create()
        runBlocking {
            var feed : Feed = api?.fetchFeed("movies", "079dac74a5f94ebdb990ecf61c8854b7", 20, 2)
            println(feed?.id)
            println(feed?.totalResults.toString())
        }

    }
}


