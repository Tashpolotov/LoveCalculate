package com.example.lovecalculate.model

import com.google.gson.annotations.SerializedName

data class LoveModel (

        @SerializedName("fname")
        var firstName : String,
        @SerializedName("sname")
        var secondName : String,
        var percentage : String,
        var result : String

        )