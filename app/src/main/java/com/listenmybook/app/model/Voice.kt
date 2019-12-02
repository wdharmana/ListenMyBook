package com.listenmybook.app.model

import com.google.gson.annotations.SerializedName

data class Voice(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("languageCode")
	val languageCode: String? = null
)