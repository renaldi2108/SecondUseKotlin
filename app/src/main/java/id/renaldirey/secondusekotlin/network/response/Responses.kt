package id.renaldirey.secondusekotlin.network.response

import com.google.gson.annotations.SerializedName
import id.renaldirey.secondusekotlin.model.Models

class Responses (
        @SerializedName("status")
        val status: Boolean?,
        @SerializedName("message")
        val message: String?,
        @SerializedName("data")
        val data: List<Models>?
)