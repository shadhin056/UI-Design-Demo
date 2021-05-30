package com.fundinghelp.moniruzzamanshadhinapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class Bkash2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bkash2)
        val customBottomNavigationView = findViewById<CustomBottomNavigationView>(R.id.customBottomBar)
        customBottomNavigationView.inflateMenu(R.menu.bottom_menu)
    }
}