package com.example.kanbanproject

import android.app.Application
import com.google.firebase.FirebaseApp


class AppKanban : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}