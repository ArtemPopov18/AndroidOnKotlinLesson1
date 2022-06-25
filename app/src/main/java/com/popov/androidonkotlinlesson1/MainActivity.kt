package com.popov.androidonkotlinlesson1

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var clickСounter: ClickСounter = ClickСounter()
        val counterOutput = findViewById<TextView>(R.id.counter_output)
        counterOutput.text = clickСounter.count.toString()
        findViewById<AppCompatButton>(R.id.button_1).setOnClickListener(object :
            View.OnClickListener {
            override fun onClick(p0: View?) {
                clickСounter.count = clickСounter.count!! + 1
                counterOutput.text = clickСounter.count.toString()
            }
        })
    }
}