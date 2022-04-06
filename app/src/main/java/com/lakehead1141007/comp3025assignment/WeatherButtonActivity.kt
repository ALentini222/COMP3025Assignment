package com.lakehead1141007.comp3025assignment

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.android.volley.Request
import com.android.volley.Request.Method.GET
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.lakehead1141007.comp3025assignment.databinding.ActivityWeatherButtonBinding
import com.squareup.okhttp.OkHttpClient
import org.json.JSONException
import java.util.*


/**
 * Weather API from Open Weather Map API
 * https://openweathermap.org/api
 * https://api.openweathermap.org/data/2.5/weather?lat={$lat}&lon={$lon}&appid={$apiKey}
 *
 * fields in the view to write to
 * location
 * time
 * skyConditions
 * temperature
 * temperatureMin
 * temperatureMax
 * sunrise
 * sunset
 * wind
 * pressure
 * humidity
 * weather
 *
 * get lon and lat
 * pull from api
 * overwrite text in view
 */
class WeatherButtonActivity : AppCompatActivity() {
    private var lon: String? = null
    private var lat: String? = null
    private val client = OkHttpClient()
    /*
    private var jsonObj: JSONObject? = null
    private var updatedAt : Long? = null
    private var updatedAtText: String? = null
    private var temp: String? = null
    private var tempMin: String? = null
    private var tempMax: String? = null
    private var pressure: String? = null
    private var humidity: String? = null

    private var sunrise:Long? = null
    private var sunset:Long? = null
    private var windSpeed: String? = null
    private var weatherDescription: String? = null

     */
    private val apiKey: String = "b41d7a97b5c8c57298c0d0fbd04bcd8e"

    private val LOCATION_PERMISSION_REQ_CODE = 1000;
    private lateinit var binding: ActivityWeatherButtonBinding
    private var requestQueue: RequestQueue? = null
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestQueue = Volley.newRequestQueue(this)
        binding = ActivityWeatherButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

