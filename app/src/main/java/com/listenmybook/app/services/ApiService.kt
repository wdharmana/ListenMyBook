package com.listenmybook.app.services

import com.listenmybook.app.model.AudioResponse
import com.listenmybook.app.model.SpeechRequest
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {

    @POST("text:synthesize")
    fun getAudio(@Header("Authorization") apiKey: String, @Body speechRequest: SpeechRequest): Single<Response<AudioResponse>>

}