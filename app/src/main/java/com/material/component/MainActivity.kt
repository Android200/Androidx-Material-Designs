package com.material.component

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.material.button.MaterialButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        materialButton1.setOnClickListener { startActivity(Intent(this, Chips_Example::class.java) ) }
        materialButton2.setOnClickListener { startActivity(Intent (this, Material_Button_Example::class.java)) }
        materialButton3.setOnClickListener { startActivity(Intent (this, Material_Card_Example::class.java) )}
        materialButton4.setOnClickListener { startActivity( Intent (this, Text_Fields_Example::class.java)) }
    }
}
