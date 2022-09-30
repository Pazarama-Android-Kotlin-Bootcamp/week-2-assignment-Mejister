package com.merttoptas.secondweeksignup

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class signupActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        val BackButton = findViewById<ImageView>(R.id.backarrow)
        BackButton.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)


        }
        var reg=findViewById<Button>(R.id.btnReg)
        reg.setOnClickListener {
            Toast.makeText(this, "Başarıyla Kaydedildi", Toast.LENGTH_SHORT).show()
        }
    }

}