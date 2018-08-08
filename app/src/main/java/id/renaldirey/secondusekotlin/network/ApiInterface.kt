package id.renaldirey.secondusekotlin.network

import id.renaldirey.secondusekotlin.network.response.Responses
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

        @GET("/tesapi/index.php/MainRoutes")
    fun getDatas(): Call<Responses>
}