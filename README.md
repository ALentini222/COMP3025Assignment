# COMP3025Assignment
A Ski Wax Calculator and Tracker

I have been working at the service desk of a ski club for about 3 years, it is always a struggle trying to find the exact right ski wax for the time of the day.  
I want to make an app that calculates the most ideal ski wax for both grip and glide wax and display the exact stats and an “easy view” with the recommended colours of the wax. 
I also want to implement a tracker to track what ski wax was previously put on my skis to easily track what has been done and what needs to be done for the current conditions

Concepts needed for this assignment:
Access DB for Ski Wax Tracker
Access API for up to date/time weather info


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
 * Figure out how to make sure the user has some sort of registration or something to keep the log of their personal ski waxes per 
 
 DB Setup:
  Needs
  -- Date
  -- Glide Wax
  -- Grip Wax
  -- Comments
  Might Use to make it simpler
  -- User
  
  -->depending on how DB intigration ends up working for this app I might setup users table so it pulls the rows where the user == user.
  -->then as stated above once a user has more than XXX number of rows the oldest row gets deleted.
  
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
As of 04/09/2022:

The app is currently in review for publishing on the google play store
![image](https://user-images.githubusercontent.com/77400292/162575748-e12a6143-db56-4747-9007-97cdc51cdd96.png)
With this, the app will hopefully be uploaded to this <a href="https://play.google.com/store/apps/details?id=com.lakehead1141007.comp3025assignment">hyperlink</a>, however if it is not there then it is still in review.  

The app has a fully working ski wax trackcer and has all the information for temperatures in F and in C, but the calculator part of the app is not currently available as I was not able to get the API working with this app at this time.  I would still like to fix this in the future as I will probably use this app thuroughly in the future but as of right now, it is not in a fully working state.

