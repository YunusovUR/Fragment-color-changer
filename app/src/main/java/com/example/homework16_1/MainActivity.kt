package com.example.homework16_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework16_1.Fragment.BlankFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val blankFragment = BlankFragment()
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.lin_container, blankFragment)
        transaction.commit()
    }
}