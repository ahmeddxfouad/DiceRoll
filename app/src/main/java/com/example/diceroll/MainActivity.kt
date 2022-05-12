package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.drawable.toDrawable
import org.w3c.dom.Text
import kotlin.random.Random as Random


class MainActivity : AppCompatActivity() {

    lateinit var dice: ImageView
    lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            rollButton= findViewById(R.id.btnRoll)
        //val dice: TextView = findViewById(R.id.tvDice)
            dice = findViewById(R.id.ivDice)

        rollButton.setOnClickListener {

            //Toast.makeText(this, "Rolling",Toast.LENGTH_SHORT).show()
            //rollingDice()
            rollingDiceImage()

            }

    }
    /*
    private fun rollingDice()
    {
        val dice: TextView = findViewById(R.id.tvDice)

        val num =  Random.nextInt(1, 6)

        dice.text = num.toString()



    }

    */
    private fun rollingDiceImage()
    {
        //val dice: ImageView = findViewById(R.id.ivDice)


        val num =  Random.nextInt(1, 6)

        val image = when (num) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6



        }

        dice.setImageResource(image)


    }


}