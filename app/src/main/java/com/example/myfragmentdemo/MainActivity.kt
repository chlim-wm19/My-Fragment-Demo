package com.example.myfragmentdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // object obj = new WelcomeFragment();
        val welcomeFrag = WelcomeFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainFrame, welcomeFrag)
            commit()
        }

    }
}