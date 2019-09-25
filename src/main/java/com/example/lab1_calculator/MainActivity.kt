package com.example.lab1_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

var total = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPlus.setOnClickListener {
            total += textViewNum.text.toString().toInt()
            textViewNum.text = ""

        }
        buttonClear.setOnClickListener {
            textViewNum.text =""
            total = 0
        }

        buttonEquals.setOnClickListener {
            if(textViewNum.text.toString().isNotEmpty()){
                total += textViewNum.text.toString().toInt()
            }

            textViewNum.text = total.toString()
        }

        button1.setOnClickListener {
            onNumButtonClicked(button1)
        }
        button2.setOnClickListener {
            onNumButtonClicked(button2)
        }
        button3.setOnClickListener {
            onNumButtonClicked(button3)
        }
        button4.setOnClickListener {
            onNumButtonClicked(button4)
        }
        button5.setOnClickListener{
            onNumButtonClicked(button5)
        }
        button6.setOnClickListener {
            onNumButtonClicked(button6)
        }
        button7.setOnClickListener {
            onNumButtonClicked(button7)
        }
        button8.setOnClickListener {
            onNumButtonClicked(button8)
        }
        button9.setOnClickListener {
            onNumButtonClicked(button9)
        }
        button0.setOnClickListener {
            onNumButtonClicked(button0)
        }




    }

    fun onNumButtonClicked(button : Button){
        var buttonText = button.text.toString()

        textViewNum.text = textViewNum.text.toString() + buttonText

    }


}
