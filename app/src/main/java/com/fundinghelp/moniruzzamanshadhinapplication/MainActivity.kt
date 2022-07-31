package com.fundinghelp.moniruzzamanshadhinapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonAction()
    }

    private fun buttonAction() {
        btnRegStatic.setOnClickListener {
            val intent = Intent(this@MainActivity, CurvedBottomNavActivity::class.java)
            startActivity(intent);
        }
        btnDynamic.setOnClickListener {
            val intent = Intent(this@MainActivity, DynamicCurvedBottomNavActivity::class.java)
            startActivity(intent);
        }
    }
}