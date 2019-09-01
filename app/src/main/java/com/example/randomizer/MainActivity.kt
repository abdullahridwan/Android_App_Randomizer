package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Create variables that links the boxes to actual code
        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        //now, we code interactoins between these variables, which directly relate to the boxes
        //on the android app
        rollButton.setOnClickListener {
            val rand = Random().nextInt(seekBar.progress)
            resultsTextView.text = rand.toString()

        }

    }
}
