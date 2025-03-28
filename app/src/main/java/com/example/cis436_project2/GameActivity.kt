package com.example.cis436_project2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GameActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        // Get game mode from Intent
        val isAI = intent?.getStringExtra("gameMode") == "ai"

        // Load TopFragment
        val topFragment = TopFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.topFragmentContainer, topFragment)
            .commitNow()

        // Load BottomFragment
        val bottomFragment = BottomFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.bottomFragmentContainer, bottomFragment)
            .commitNow()

        // Update UI based on game mode
        topFragment.view?.post {
            topFragment.setGameMode(isAI)
        }
    }
}