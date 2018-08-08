package id.renaldirey.secondusekotlin.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object {
        fun getApiClient(): Retrofit {
            val BASE_URL: String? = "http://rxatnys.id/"
            val retrofit: Retrofit = Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create())
                    .build()

            return retrofit
        }
    }
}