package com.example.desafiodevexpert.data

import com.example.desafiodevexpert.data.model.MovieResult
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesService {
    @GET("discover/movie?sort_by=popularity.desc")
    suspend fun getMovies(
        @Query("api_key") apiKey: String,
        @Query("region") region: String
    ): MovieResult
}

object RetrofitServiceFactory {
    fun makeRetrofitService(): MoviesService {
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(MoviesService::class.java)
    }
}