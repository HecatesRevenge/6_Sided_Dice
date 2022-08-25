package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    //this method is called when Activity is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // find the button in the layout
        val rollButton: Button = findViewById(R.id.button)
        // This sets the value of the button to the interactive button found in activity_main//
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        //creates a dice with 6 sides and rolls it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        //Updates the screen with the result of the Dice roll//
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    //Sets a dice with a fixed number of sides//
    class Dice(val numSides: Int) {
        //Do a random dice roll and return the results//
        fun roll(): Int {
            return (1..numSides).random()
        }


    }
}
