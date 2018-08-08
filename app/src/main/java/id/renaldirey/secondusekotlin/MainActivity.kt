package id.renaldirey.secondusekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import id.renaldirey.secondusekotlin.adapter.AdapterBio
import id.renaldirey.secondusekotlin.network.ApiClient
import id.renaldirey.secondusekotlin.network.ApiInterface
import id.renaldirey.secondusekotlin.network.response.Responses
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private val apiInterface: ApiInterface = ApiClient.getApiClient().create(ApiInterface::class.java)
    private var adapters: AdapterBio?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val call: Call<Responses> = apiInterface.getDatas()
        rv_lists.layoutManager = LinearLayoutManager(this)

        call.enqueue(object: Callback<Responses> {
            override fun onResponse(call: Call<Responses>, response: Response<Responses>) {
                if(response.code() == 200){
                    setAdapter(response.body()!!)
                }
            }

            override fun onFailure(call: Call<Responses>, t: Throwable) {
                Log.e(MainActivity::class.java.simpleName+".error", t.toString())
            }
        })
    }

    fun setAdapter(list: Responses) {
        adapters = AdapterBio(this, list.data!!)
        rv_lists.adapter = adapters
    }
}
