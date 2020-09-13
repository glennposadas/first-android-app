package com.glennposadas.urbandicsample

import com.google.gson.annotations.SerializedName


data class Term(
    @SerializedName("word")
    val word: String,
    @SerializedName("definition")
    val definition: String,
    @SerializedName("thumbs_up")
    val likes: String,
    @SerializedName("thumbs_down")
    val dislikes: String
)