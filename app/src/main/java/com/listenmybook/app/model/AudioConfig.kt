package com.listenmybook.app.model

import com.google.gson.annotations.SerializedName

data class AudioConfig(

	@field:SerializedName("speakingRate")
	val speakingRate: Double? = null,

	@field:SerializedName("audioEncoding")
	val audioEncoding: String? = null,

	@field:SerializedName("pitch")
	val pitch: Int? = null
)