package com.example.cis436_project2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_start)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnPlayFriend = findViewById<Button>(R.id.againstFriendBtn)
        val btnPlayAI = findViewById<Button>(R.id.againstAIBtn)

        btnPlayFriend.setOnClickListener {
            val intent = Intent(this@StartActivity, GameActivity::class.java)
            intent.putExtra("gameMode", "friend") // Pass game mode information
            startActivity(intent)
        }

        btnPlayAI.setOnClickListener {
            val intent = Intent(this@StartActivity, GameActivity::class.java)
            intent.putExtra("gameMode", "ai") // Pass game mode information
            startActivity(intent)
        }
    }
}