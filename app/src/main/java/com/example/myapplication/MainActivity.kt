package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get the button view from the layout qnd assign a click
        //Listener to it
        val rollButton: Button = findViewById( R.id.rollBtn)
        rollButton.setOnClickListener{ rollDice()}

    }

    private fun rollDice(){
        Toast.makeText(this,"Dice is rolled",Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.txtNumber)
        resultText.text=randomInt.toString()
    }
}