package com.material.component

import android.content.Intent
import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat

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
        materialButton5.setOnClickListener{startActivity(Intent(this, Login_Animation_Ex::class.java))}

        val avd2 = AnimatedVectorDrawableCompat.create(this, R.drawable.heart_rate)
        imageView2.setImageDrawable(avd2)
        val animatable2 = imageView2.getDrawable() as Animatable
        animatable2.start()
    }
}
