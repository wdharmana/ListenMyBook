package com.listenmybook.app.model

import com.google.gson.annotations.SerializedName

data class Input(

	@field:SerializedName("text")
	val text: String? = null
)