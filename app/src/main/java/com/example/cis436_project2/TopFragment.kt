package com.example.cis436_project2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class TopFragment : Fragment() {
    private lateinit var otherPlayerTV: TextView
    private lateinit var playerTwoIcon: ImageView
    private lateinit var aiIcon: ImageView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_top, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        otherPlayerTV = view.findViewById(R.id.otherPlayerTV)
        playerTwoIcon = view.findViewById(R.id.playerTwoIcon)
    }

    fun setGameMode(isAI: Boolean) {
        if (isAI) {
            otherPlayerTV.text = "AI"
            playerTwoIcon.visibility = ImageView.GONE
            aiIcon.visibility = ImageView.VISIBLE
        } else {
            otherPlayerTV.text = "Player 2"
            aiIcon.visibility = ImageView.GONE
            playerTwoIcon.visibility = ImageView.VISIBLE
        }
    }
}