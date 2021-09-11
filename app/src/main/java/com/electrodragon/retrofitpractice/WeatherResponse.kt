package com.electrodragon.retrofitpractice

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
        val city: String,
        val village: String,
        val temperature: String,
        @SerializedName("room-temperature") val roomTemperature: String
)
