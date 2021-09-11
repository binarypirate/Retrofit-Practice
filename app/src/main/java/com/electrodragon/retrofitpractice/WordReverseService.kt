package com.electrodragon.retrofitpractice

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface WordReverseService {
    @FormUrlEncoded
    @POST("reverse.php")
    fun reverseWord(
            @Field("word1") word1: String,
            @Field("word2") word2: String
    ): Call<WordResponse>
}