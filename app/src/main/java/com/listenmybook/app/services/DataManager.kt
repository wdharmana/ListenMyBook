package com.listenmybook.app.services

import com.listenmybook.app.model.AudioResponse
import com.listenmybook.app.model.SpeechRequest
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataManager @Inject
constructor(private val api: ApiService) {

    fun getAudio(apiKey: String, speechRequest: SpeechRequest): Single<Response<AudioResponse>> {
        return api.getAudio(apiKey, speechRequest)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

}