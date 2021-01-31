package com.rofi_18102032.praktikum14.model

import com.google.gson.annotations.SerializedName

data class Login(
    @SerializedName("token")
    var token: String? = null,
    @SerializedName("message")
    var message: String? = null
)