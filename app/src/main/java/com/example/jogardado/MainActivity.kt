package com.example.jogardado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val jogarDadoButton: Button = findViewById(R.id.jogar_button)
        diceImage = findViewById(R.id.image_dice)
        jogarDadoButton.setOnClickListener{
            jogarDado()
        }
    }

    private fun jogarDado() {

        val number = Random().nextInt(6) + 1

        val image_drawable = when (number) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(image_drawable)

    }
}
