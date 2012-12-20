CodedayDecemberResources - FacebookSDKConnect
========================

##What is this... I don't even
Simply put, a very basic implementation of the Facebook Android SDK.
<br />
<strong>This application requires Android 2.2 or higher.</strong>
<br /><br />
+ When the app is running, click the "Connect with Facebook" button.
+ You'll then be asked to authorize the application with your Facebook credentials if you've not already authorized it.
+ Upon returning to the application, you should see a dump of your Facebook account's data.
+ You can change Line 43 in src/../MainActivity.java to output specific information.
+ For example, you can get your Facebook userID with by replacing line 43 with the following:
	`dumpTextField.setText(user.getId());`

##Steps to get started
+ Go through the https://developers.facebook.com/docs/getting-started/facebook-sdk-for-android/3.0/
+ Make sure you're able to run at least one of the sample projects provided in the Android SDK before your continue.
+ Rename this project's package to something unique
+ Create a Facebook application and configure it according to your new application package
+ In the /res/values/strings.xml file, set the value of your Facebook app id
+ Clean and build your project, then go ahead and give it a try

##Issues or concerns
+ Any issues you have should be easily solved with a bit of searching around the web.
+ I personally had a difficult time getting the Facebook Android SDK setup properly in the first place.
Instead of placing the SDK folder under my home directory (C:/Users/YOURUSERNAME/ for Windows), I placed it directly into my workspace folder (C:/Java for my personal configuration).
+ Regardless, feel free to create an issue and I'll do my best to respond quickly