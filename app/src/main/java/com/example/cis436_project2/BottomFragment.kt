package com.example.cis436_project2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout

class BottomFragment : Fragment() {
    private lateinit var ticTacToeBoard: GridLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bottom, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ticTacToeBoard = view.findViewById(R.id.ticTacToeBoard)
        setupBoard()
    }

    private fun setupBoard() {
        // Initialize game board logic here

    }
}