package id.renaldirey.secondusekotlin.model

import com.google.gson.annotations.SerializedName

class Models (
        @SerializedName("id")
        val id: String?,
        @SerializedName("nama")
        val nama: String?
)