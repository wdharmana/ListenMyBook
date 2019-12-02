package com.listenmybook.app.model

import com.google.gson.annotations.SerializedName

data class SpeechRequest(

	@field:SerializedName("voice")
	val voice: Voice? = null,

	@field:SerializedName("input")
	val input: Input? = null,

	@field:SerializedName("audioConfig")
	val audioConfig: AudioConfig? = null
)