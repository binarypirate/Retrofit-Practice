package com.electrodragon.retrofitpractice

import retrofit2.Call
import retrofit2.http.GET

interface FetchWeatherService {
    @GET("weather.php")
    fun getWeather(): Call<WeatherResponse>
}