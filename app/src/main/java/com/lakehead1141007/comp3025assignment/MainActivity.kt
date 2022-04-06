package com.lakehead1141007.comp3025assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakehead1141007.comp3025assignment.databinding.ActivityMainBinding

/**
 * This page has 4 buttons for 4 different activities and a quick content view
 *
 * On the main page it has two colour recommendations for grip and glide wax in the two image views(rectangles)
 * --> might turn into grip adn glide rectangle to display colours for the grip and glide
 * --> changes depending on weather for location of phone based off weather api
 *
 * Weather button directs to a view of the weather apps 7 day forecast for temp and precipitation
 *
 * Weather details button shows the exact temp, "Age" of the snow and the recommended ski wax for those conditions
 * -->eg. if the snow is new and cold the recommended wax is different from old snow and cold snow
 * -->might add more relevant information depending on what else is needed
 *
 * Log Wax Button will direct to a page where you can select a wax and have an option for other, select the date, and add comments
 * -->store the data to a DB
 * ---->DB does not need to be an intense DB it just needs to read and write functionality to input to the db and then show all the data
 *
 * View Wax Log Button will pull all of the DB info out on display in a table to view the past wax
 * -->might make a quick and detailed view
 * -->ie. date & wax and have a view details button to pull up all the columns in the row
 *
 * Might also ensure the db is not intense by deleting past 30 times... to keep the app simpler you don't really need to see all of
 * the waxes ever done.
 *
 * Figure out how to make sure the user has some sort of registration or something to keep the log of their personal ski waxes per device
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.skiWaxLogButton.setOnClickListener{
            val intent = Intent(this, LogWaxActivity::class.java)
            startActivity(intent)
        }
        binding.waxLogDetailsButton.setOnClickListener{
            val intent = Intent(this, DetailedWaxLogActivity::class.java)
            startActivity(intent)
        }
        binding.weatherButton.setOnClickListener{
            val intent = Intent(this, WeatherButtonActivity::class.java)
            startActivity(intent)
        }
        binding.registerLogin.setOnClickListener{
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onStart(){
        super.onStart()
    }
    override fun onResume(){
        super.onResume()
    }
    override fun onPause(){
        super.onPause()
    }
    override fun onStop(){
        super.onStop()
    }
    override fun onDestroy() {
        super.onDestroy()
    }
}