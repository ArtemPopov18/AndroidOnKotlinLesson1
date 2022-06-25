package com.popov.androidonkotlinlesson1

import android.os.Bundle
import android.util.Log
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
        val textDataClass1 = findViewById<TextView>(R.id.textDataClass1)
        val textDataClass2 = findViewById<TextView>(R.id.textDataClass2)

        counterOutput.text = clickСounter.count.toString()
        findViewById<AppCompatButton>(R.id.button_1).setOnClickListener(object :
            View.OnClickListener {
            override fun onClick(p0: View?) {
                clickСounter.count = clickСounter.count!! + 1
                counterOutput.text = clickСounter.count.toString()
            }
        })
        val city1: City = City("Самара", 436)
        val city2: City = city1.copy("Tomsk", 418)
        textDataClass1.text = "${city1.name} ${city1.age.toString()}"
        textDataClass2.text = "${city2.name} ${city2.age.toString()}"

        fun testIf(){
            if (city1.age > city2.age){
                Log.d("@@@", "${city1.name} раньше основали")
            } else {
                Log.d("@@@", "${city2.name} раньше основали")
            }
        }

        testIf()
    }
}