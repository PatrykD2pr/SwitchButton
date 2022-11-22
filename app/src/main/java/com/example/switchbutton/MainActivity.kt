package com.example.switchbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //przyciski
        val los = findViewById<Button>(R.id.los)
        val sort = findViewById<Button>(R.id.sort)
        //switche
        val switch1 = findViewById<Switch>(R.id.sw1)
        val switch2 = findViewById<Switch>(R.id.sw2)
        val switch3 = findViewById<Switch>(R.id.sw3)
        val switch4 = findViewById<Switch>(R.id.sw4)
        val switch5 = findViewById<Switch>(R.id.sw5)
        val switch6 = findViewById<Switch>(R.id.sw6)
        val switch7 = findViewById<Switch>(R.id.sw7)
        val switch8 = findViewById<Switch>(R.id.sw8)
        val switch9 = findViewById<Switch>(R.id.sw9)
    }
}