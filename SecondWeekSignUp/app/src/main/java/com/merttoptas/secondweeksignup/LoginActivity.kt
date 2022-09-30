package com.merttoptas.secondweeksignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class LoginActivity : AppCompatActivity() {
    private lateinit var ivChangePasswordVisibility: ImageView
    private var isVisibilityOn = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        ivChangePasswordVisibility = findViewById(R.id.ivShowPassword)

        ivChangePasswordVisibility.setOnClickListener {
            if (isVisibilityOn) {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_24)
                isVisibilityOn = false
            } else {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                isVisibilityOn = true
            }
        }
        val signu = findViewById<Button>(R.id.btnSignUp)
        signu.setOnClickListener {
            val intent = Intent(this, signupActivity::class.java)
            startActivity(intent)
        }

    }
}