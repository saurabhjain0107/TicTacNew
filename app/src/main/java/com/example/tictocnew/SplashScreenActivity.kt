package com.example.tictocnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        image.translationY = -1000f
        text.translationY = 1000f

        image.animate().translationY(0f).duration = 2000
        text.animate().translationY(0f).duration = 2000

        Handler(Looper.getMainLooper()).postDelayed({
          val intent = Intent(this,MainActivity::class.java)
          startActivity(intent)
        },3000)

    }
}