package com.listenmybook.app.model

import com.google.gson.annotations.SerializedName

data class AudioResponse(

	@field:SerializedName("audioContent")
	val audioContent: String? = null

)