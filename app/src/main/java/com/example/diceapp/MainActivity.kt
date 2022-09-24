package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    //this method is called when Activity is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // find the button in the layout
        val rollButton: Button = findViewById(R.id.button)
        // This sets the value of the button to the interactive button found in activity_main//
        rollButton.setOnClickListener { rollDice();rollDice0()}

        // Do a dice roll on start-up
        rollDice()
    }

    private fun rollDice() {
        //creates a dice with 6 sides and rolls it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView2)
        // Updates screen with the image for dice roll that display #2



        /* Uses control flow if/else statements to display corresponding
         side of dice when pressing the roll button
         */

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceImage.setImageResource((drawableResource))
        // Sets content description of dice image
        diceImage.contentDescription = diceRoll.toString()
    }
    private fun rollDice0() {
        //creates a dice with 6 sides and rolls it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView2)
        // Updates screen with the image for dice roll that display #2



        /* Uses control flow if/else statements to display corresponding
         side of dice when pressing the roll button
         */

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceImage.setImageResource((drawableResource))
        // Sets content description of dice image
        diceImage.contentDescription = diceRoll.toString()
    }

    //Sets a dice with a fixed number of sides//
    class Dice(private val numSides: Int) {
        //Do a random dice roll and return the results//
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
    class Dice0(private  val numSides: Int){
        fun roll(): Int {
            return (1..numSides).random()
        }
    }




}




