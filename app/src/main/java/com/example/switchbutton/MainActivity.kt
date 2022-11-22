package com.example.switchbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val los = findViewById<Button>(R.id.los)
        val sort = findViewById<Button>(R.id.sort)
        val switch1 = findViewById<Switch>(R.id.sw1)
        val switch2 = findViewById<Switch>(R.id.sw2)
        val switch3 = findViewById<Switch>(R.id.sw3)
        val switch4 = findViewById<Switch>(R.id.sw4)
        val switch5 = findViewById<Switch>(R.id.sw5)
        val switch6 = findViewById<Switch>(R.id.sw6)
        val switch7 = findViewById<Switch>(R.id.sw7)
        val switch8 = findViewById<Switch>(R.id.sw8)
        val switch9 = findViewById<Switch>(R.id.sw9)
        var liczby = findViewById<TextView>(R.id.textView)
        val przyciski: ArrayList<Int> = ArrayList()
        var index = 0
                                                                                        // 7 2 4 8 2 1 1 4 4
                                                                                        // 1 1 2 2 4 4 4 7 8
        los.setOnClickListener {
            przyciski.clear()
            index = 0
            liczby.text = ""
            while (przyciski.size < 9) {
                var losowa = Random.nextInt(1, 9)
                przyciski.add(losowa)
                liczby.text = liczby.text.toString() + przyciski[index].toString() + " "
                index = index + 1
            }
        }
        sort.setOnClickListener {
            liczby.text = ""
            for (i in 0 until 8)
            {
                if (przyciski[i] > przyciski[i+1])
                {
                    var x = przyciski[i]
                    przyciski[i] = przyciski[i+1]
                    przyciski[i+1] = x
                }
                liczby.text = liczby.text.toString() + przyciski[i].toString() + " "
            }
            liczby.text = liczby.text.toString() + przyciski[8].toString()
        }
    }
}