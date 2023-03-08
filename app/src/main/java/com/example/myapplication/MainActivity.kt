package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get the button view from the layout qnd assign a click
        //Listener to it
        val rollButton: Button = findViewById( R.id.rollBtn)
        rollButton.setOnClickListener{ rollDice()}
        diceImage = findViewById(R.id.dice_image)

    }

    private fun rollDice(){
        Toast.makeText(this,"Dice is rolled",Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        val resultText: TextView = findViewById(R.id.txtNumber)
        resultText.text=randomInt.toString()
    }
}