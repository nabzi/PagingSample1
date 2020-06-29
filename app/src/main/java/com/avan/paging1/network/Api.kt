package com.avan.paging1.network

import com.avan.paging1.model.Feed
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface RestApi {
    /*
     * We would be using the below url:
     * https://newsapi.org/v2/everything?q=movies&apiKey=079dac74a5f94ebdb990ecf61c8854b7&pageSize=20&page=2
     * The url has four query parameters.
     * We would be changing the pageSize and the page
     */
    @GET("/v2/everything")
    suspend fun fetchFeed(
        @Query("q") q: String?,
        @Query("apiKey") apiKey: String?,
        @Query("page") page: Long,
        @Query("pageSize") pageSize: Int
    ): Feed
}
class RestApiFactory{
    private val BASE_URL = "https://newsapi.org"

    fun create(): RestApi? {
//        val logging = HttpLoggingInterceptor()
//        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val httpClient = OkHttpClient.Builder()
        // httpClient.addInterceptor(logging)
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build()
        return retrofit.create(RestApi::class.java)
    }
}
