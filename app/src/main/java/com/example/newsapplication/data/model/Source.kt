package com.example.newsapplication.data.model


import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("id")
    var id: String = "",
    @SerializedName("name")
    val name: String
)