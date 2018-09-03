package com.qegle.pushme

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.messaging.FirebaseMessaging

class MainA : AppCompatActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.a_main)
		FirebaseMessaging.getInstance().unsubscribeFromTopic("ru-android-news")
		FirebaseMessaging.getInstance().subscribeToTopic("ru-android-news")
	}
}
