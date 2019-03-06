package com.example.putardadu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val putarButton: Button = findViewById(R.id.btn_putar)
        val diceImage: ImageView = findViewById(R.id.dice_image)
        putarButton.text="Les't Go"
        putarButton.setOnClickListener {
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        }
        putarButton.setOnClickListener {
            kocokDadu()
        }
    }
    private fun kocokDadu(){
        val randomInt = Random().nextInt(6)+1

        val drawableRecource = when (randomInt){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        dice_image.setImageResource(drawableRecource)
    }
}
