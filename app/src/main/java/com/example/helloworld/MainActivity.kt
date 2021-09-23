package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.random.Random
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun hi(): String {
            return "Hello World"
        }
        val object1 = hi()
        val message = "Welcome!"
        Log.d("MainActivity", "Hi")
        Log.d("MainActivity", "${hi()}")
        Log.d("MainActivity", object1)
        Log.d("MainActivity", message)
        ////////////
        val number1 = Random.nextInt(100)
        val number2 = Random.nextInt(100)
        val sum = number1 + number2
        Log.d("MainActivity", "$number1 + $number2 = $sum")



    }
}