Celeb 140 Android App
---------------------

Android app for browing the tweets from Celebrity Twitter users.

The project assumes the Android SDK is installed and an Android Virtual Device (AVD) named 'Android2.1' targeting platform 2.1 and API level 7 has been created.

To build and run the project firstly start up the 'Android2.1' AVD.

Then execute: 

#mvn -Dandroid.sdk.path=/path/to/android/sdk install' 

(Replacing the path with the path to your Android SDK installation.)

Once built run:

#mvn android:deploy

to deploy the application