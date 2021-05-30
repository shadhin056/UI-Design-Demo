package com.fundinghelp.moniruzzamanshadhinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import kotlinx.android.synthetic.main.activity_bkash.*

class BkashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bkash)

        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.home))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.qr))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.inbox))
    }
}