package com.example.kanbanproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.signOutButton).setOnClickListener {
            Firebase.auth.signOut()
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        if (Firebase.auth.currentUser == null){
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}