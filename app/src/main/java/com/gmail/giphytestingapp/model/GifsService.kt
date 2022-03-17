package com.gmail.giphytestingapp.model

import com.gmail.giphytestingapp.BuildConfig
import com.gmail.giphytestingapp.model.entity.GifResponse
import com.google.gson.internal.GsonBuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface GifsService {

    @GET("v1/gifs/search")
    suspend fun searchGifs(
        @Query("api_key") apiKey: String = BuildConfig.ApiKey,
        @Query("q") query: String,
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
        @Query("rating") rating: String = "q",
        @Query("lang") lang: String = "en"
    ): GifResponse

    companion object {
        private const val BASE_URL = "https://api.giphy.com/"

        fun create(): GifsService {
            val logger =
                HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.HEADERS }

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GifsService::class.java)
        }
    }
}