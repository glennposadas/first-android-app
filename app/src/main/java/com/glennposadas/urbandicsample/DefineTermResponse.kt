package com.glennposadas.urbandicsample

import com.google.gson.annotations.SerializedName

// struct
data class DefineTermResponse(
    @SerializedName("list")
    val terms: List<Term>
)