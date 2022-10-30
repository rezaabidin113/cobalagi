package com.example.coba;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

public class MainActivity AppCompatActivity {

private lateinit var btnIntent : Button

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                btnIntent = findViewById(R.id.btn_intent)
                btnIntent.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
                if (v != null) {
                when(v.id) {
                        R.id.btn_intent -> run {
                                val intentBiasa = Intent(this@MainActivity, IntentKeduaActivity::class.java)
                                startActivity(intentBiasa)
                                }
                        }
                }
        }
}